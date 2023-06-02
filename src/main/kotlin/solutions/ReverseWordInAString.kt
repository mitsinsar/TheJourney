package solutions

import core.Executable

/**
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example:
Input: s = "   the sky is blue "
Output: "blue is sky the"
 */
class ReverseWordInAString : Executable<String, String> {

    override fun invoke(args: String): String {
        val resultStringBuilder = StringBuilder()
        val wordStringBuilder = StringBuilder()
        for (index in args.indices) {
            if (args[index] != ' ') {
                wordStringBuilder.append(args[index])
            } else {
                if (wordStringBuilder.isNotEmpty()) {
                    if (resultStringBuilder.isNotEmpty()) {
                        resultStringBuilder.insert(0, ' ')
                    }
                    resultStringBuilder.insert(0, wordStringBuilder)
                    wordStringBuilder.clear()
                }
            }
            if (index == args.lastIndex && wordStringBuilder.isNotEmpty()) {
                if (resultStringBuilder.isNotEmpty()) resultStringBuilder.insert(0, ' ')
                resultStringBuilder.insert(0, wordStringBuilder)
            }
        }
        return resultStringBuilder.toString()
    }
}
