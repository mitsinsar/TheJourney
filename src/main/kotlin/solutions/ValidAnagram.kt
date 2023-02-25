package solutions

import core.Executable

class ValidAnagram : Executable<ValidAnagram.ValidAnagramArgs, Boolean> {

    override fun invoke(args: ValidAnagramArgs): Boolean {
        if (args.firstWord.length != args.secondWord.length) return false
        val firstWordArray = args.firstWord.toCharArray().apply { sort() }
        val secondWordArray = args.secondWord.toCharArray().apply { sort() }
        return firstWordArray.contentEquals(secondWordArray)
    }

    data class ValidAnagramArgs(val firstWord: String, val secondWord: String)
}
