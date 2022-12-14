package solutions

import core.Executable
import core.ListNode
import core.ListNode.Companion.createListNodes

/**

https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example;

2 -> 4 -> 3
5 -> 6 -> 4
-----------
7 -> 0 -> 8

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */

class AddTwoNumbers : Executable<AddTwoNumbers.AddTwoNumbersArgs, ListNode<Int>> {

    override fun invoke(args: AddTwoNumbersArgs): ListNode<Int> {
        val nodeList1 = args.l1
        val nodeList2 = args.l2

        val resultMutableList = mutableListOf<Int>()
        calculateResultOfNodeSum(nodeList1, nodeList2, hasCarry = false) {
            resultMutableList.add(it)
        }
        return createListNodes(resultMutableList)
    }

    private fun calculateResultOfNodeSum(
        nodeList1: ListNode<Int>?,
        nodeList2: ListNode<Int>?,
        hasCarry: Boolean,
        onResultCalculated: (Int) -> Unit
    ) {
        val sumOfNodeValues = getSumOfNodeValues(nodeList1, nodeList2, hasCarry)
        val remaining = sumOfNodeValues.rem(10)
        onResultCalculated(remaining)

        val hasCarryForNextCalculation = sumOfNodeValues > remaining

        if (nodeList1?.next != null || nodeList2?.next != null) {
            calculateResultOfNodeSum(nodeList1?.next, nodeList2?.next, hasCarryForNextCalculation, onResultCalculated)
        } else {
            if (hasCarryForNextCalculation) onResultCalculated(1)
        }
    }

    private fun getSumOfNodeValues(nodeList1: ListNode<Int>?, nodeList2: ListNode<Int>?, hasRemainder: Boolean): Int {
        val result = (nodeList1?.value ?: 0) + (nodeList2?.value ?: 0)
        return result.takeIf { !hasRemainder } ?: (result + 1)
    }

    data class AddTwoNumbersArgs(
        val l1: ListNode<Int>,
        val l2: ListNode<Int>
    )
}
