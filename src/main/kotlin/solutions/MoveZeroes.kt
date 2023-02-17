package solutions

import core.Executable
import java.util.*

class MoveZeroes : Executable<IntArray, IntArray> {

    override fun invoke(args: IntArray): IntArray {
        val nums = args
        val zeroIndexQueue = LinkedList<Int>()

        nums.forEachIndexed { index, number ->
            if (number == 0) {
                zeroIndexQueue.add(index)
                return@forEachIndexed
            }

            if (zeroIndexQueue.isNotEmpty()) {
                nums[zeroIndexQueue.pop()] = number
                nums[index] = 0
                zeroIndexQueue.add(index)
            }
        }
        return nums
    }
}
