package solutions

import core.Executable

/**
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"

 */
class ReverseVowelsOfAString : Executable<String, String> {

    override fun invoke(args: String): String {
        var leftIndex = 0
        var rightIndex = args.length - 1
        val charArray = args.toCharArray()
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && !isVowel(args[leftIndex])) {
                leftIndex++
            }
            while (rightIndex > leftIndex && !isVowel(args[rightIndex])) {
                rightIndex--
            }
            charArray[leftIndex] = charArray[rightIndex].also { charArray[rightIndex] = charArray[leftIndex] }
            leftIndex++
            rightIndex--
        }
        return charArray.concatToString()
    }

    private fun isVowel(char: Char): Boolean {
        return char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' ||
                char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U'
    }
}
