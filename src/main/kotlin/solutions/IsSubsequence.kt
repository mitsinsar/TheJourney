package solutions

import core.Executable

class IsSubsequence : Executable<IsSubsequence.IsSubsequenceArgs, Boolean> {

    override fun invoke(args: IsSubsequenceArgs): Boolean {
        if (args.subsequence.isEmpty()) return true
        var substringTextIndex = 0
        for (index in args.text.indices) {
            if (args.text[index] == args.subsequence[substringTextIndex]) {
                substringTextIndex++
            }
            if (substringTextIndex !in args.subsequence.indices) break
        }
        return substringTextIndex == args.subsequence.length
    }

    data class IsSubsequenceArgs(
        val subsequence: String,
        val text: String
    )
}
