package solutions

import core.Executable

class MajorityElement : Executable<IntArray, Int> {
    override fun invoke(args: IntArray): Int {
        var count = 1
        var candidate: Int = args.first()
        args.forEach { number ->
            if (count == 0) candidate = number
            count = if (number == candidate) count.inc() else count.dec()
        }
        return candidate
    }
}
