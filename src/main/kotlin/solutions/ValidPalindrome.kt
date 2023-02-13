package solutions

import core.Executable

class ValidPalindrome : Executable<String, Boolean> {

    override fun invoke(args: String): Boolean {
        if (args.length == 1) return true
        var startIndex = 0
        var isPalindrome = true
        val cleanedText = Regex("[^A-Za-z0-9]").replace(args.lowercase(), "")
        var endIndex = cleanedText.length - 1

        while (startIndex < endIndex) {
            isPalindrome = cleanedText[startIndex] == cleanedText[endIndex]
            if (!isPalindrome) break
            startIndex += 1
            endIndex -= 1
        }
        return isPalindrome
    }
}
