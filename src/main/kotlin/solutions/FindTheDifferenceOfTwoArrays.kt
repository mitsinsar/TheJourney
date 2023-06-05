package solutions

import core.Executable
import solutions.FindTheDifferenceOfTwoArrays.FindTheDifferenceOfTwoArraysArgs

/**
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

Example;
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2.
Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2.
Therefore, answer[1] = [4,6].
 */
class FindTheDifferenceOfTwoArrays : Executable<FindTheDifferenceOfTwoArraysArgs, List<List<Int>>> {

    override fun invoke(args: FindTheDifferenceOfTwoArraysArgs): List<List<Int>> {
        with(args) {
            if (firstArray.isEmpty()) {
                return listOf(listOf(), secondArray.toList())
            }
            if (secondArray.isEmpty()) {
                return listOf(firstArray.toList(), listOf())
            }
            val firstSet = firstArray.toHashSet()
            val secondSet = secondArray.toHashSet()
            val firstSetResult = firstSet.mapNotNull { firstSetNumber ->
                firstSetNumber.takeIf { !secondSet.contains(it) }.also {
                    if (it == null) secondSet.remove(firstSetNumber)
                }
            }
            return mutableListOf<List<Int>>().apply {
                add(firstSetResult.toList())
                add(secondSet.toList())
            }
        }
    }

    data class FindTheDifferenceOfTwoArraysArgs(
        val firstArray: IntArray,
        val secondArray: IntArray
    )
}
