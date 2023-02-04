package solutions

import core.Executable

class SingleNumber : Executable<IntArray, Int> {

    override fun invoke(args: IntArray): Int {
        return mutableMapOf<Int, Int>().apply {
            args.forEach { number ->
                if (containsKey(number)) remove(number) else set(number, number)
            }
        }.keys.first()
    }
}
