package solutions

import core.Executable

class ClimbingStairs : Executable<Int, Int> {

    override fun invoke(args: Int): Int {
        if (args <= 2) return args
        var previousStep1 = 1
        var previousStep2 = 2

        repeat(args - 2) {
            previousStep2 += previousStep1.also { previousStep1 = previousStep2 }
        }
        return previousStep2
    }
}
