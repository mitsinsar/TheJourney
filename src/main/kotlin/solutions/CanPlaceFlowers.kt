package solutions

import core.Executable

/**
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
and an integer n, return true if n new flowers can be planted in the flowerbed without violating
the no-adjacent-flowers rule and false otherwise.

Example:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
 */
class CanPlaceFlowers : Executable<CanPlaceFlowers.CanPlaceFlowersArgs, Boolean> {

    override fun invoke(args: CanPlaceFlowersArgs): Boolean {
        if (args.newFlowers == 0) return true
        var remainingFlowers = args.newFlowers
        fun getOrZero(index: Int) = args.flowerbed.getOrElse(index) { 0 }
        with(args) {
            for (index in flowerbed.indices) {
                if ((getOrZero(index - 1) + flowerbed[index] + getOrZero(index + 1)) == 0) {
                    flowerbed[index] = 1
                    remainingFlowers--
                }
                if (remainingFlowers == 0) return true
            }
        }
        return false
    }

    data class CanPlaceFlowersArgs(
        val flowerbed: IntArray,
        val newFlowers: Int
    )
}
