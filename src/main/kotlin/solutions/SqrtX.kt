package solutions

import core.Executable

class SqrtX : Executable<Int, Int> {

    override fun invoke(args: Int): Int {
        var iterationCount = -1
        var latestSubtractedNumber = 1
        var remainingNumber = args
        while (remainingNumber >= 0) {
            remainingNumber -= latestSubtractedNumber
            latestSubtractedNumber += 2
            iterationCount += 1
        }
        return iterationCount
    }
}
