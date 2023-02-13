package solutions

import core.Executable

class FirstUniqueCharacterInAString : Executable<String, Int> {

    override fun invoke(args: String): Int {
        val charSet = mutableMapOf<Char, Int>()
        args.forEachIndexed { index, char ->
            val previousItem = charSet[char]
            charSet[char] = if (previousItem == null) index else -1
        }

        for (item in charSet) {
            if (item.value >= 0) return item.value
        }
        return -1
    }
}
