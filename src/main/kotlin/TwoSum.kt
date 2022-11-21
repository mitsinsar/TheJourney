/**

https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

class TwoSum : Executable<TwoSum.TwoSumArgs, IntArray> {

    override operator fun invoke(args: TwoSumArgs): IntArray {
        val numbers: IntArray = args.nums
        val target: Int = args.target

        val numberAndNumberIndexMap = mutableMapOf<Int, Int>()
        numbers.forEachIndexed { numberIndex, number ->
            if (numberAndNumberIndexMap.containsKey(target - number)) {
                return intArrayOf(numberAndNumberIndexMap[target - number]!!, numberIndex)
            }
            numberAndNumberIndexMap[number] = numberIndex
        }
        return intArrayOf()
    }

    data class TwoSumArgs(
        val nums: IntArray,
        val target: Int
    )
}
