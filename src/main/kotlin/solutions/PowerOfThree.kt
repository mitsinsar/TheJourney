package solutions

import core.Executable

class PowerOfThree : Executable<Int, Boolean> {

    override fun invoke(args: Int): Boolean {
        // The biggest power of 3 that fits into 32 bits is
        // ULong -> 3486784401 (3^20)
        // Long ->  1162261467 (3^19)
        return args > 0 && 1162261467 % args == 0
    }
}
