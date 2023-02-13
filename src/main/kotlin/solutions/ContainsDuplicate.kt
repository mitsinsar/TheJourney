package solutions

import core.Executable

class ContainsDuplicate : Executable<IntArray, Boolean> {

    override fun invoke(args: IntArray): Boolean {
        val numberSet = mutableSetOf<Int>()
        args.forEach { number ->
            if (!numberSet.add(number)) return true
        }
        return false
    }
}
