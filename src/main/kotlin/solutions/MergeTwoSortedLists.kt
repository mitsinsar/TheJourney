package solutions

import core.Executable
import core.ListNode

/**
https://leetcode.com/problems/merge-two-sorted-lists/

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

class MergeTwoSortedLists : Executable<MergeTwoSortedLists.MergeTwoSortedListsArgs, ListNode<Int>?> {

    override fun invoke(args: MergeTwoSortedListsArgs): ListNode<Int>? {
        val list1 = args.list1 ?: return args.list2
        val list2 = args.list2 ?: return args.list1

        return if (list1.value <= list2.value) {
            list1.next = invoke(MergeTwoSortedListsArgs(list1.next, list2))
            list1
        } else {
            list2.next = invoke(MergeTwoSortedListsArgs(list2.next, list1))
            list2
        }
    }

    data class MergeTwoSortedListsArgs(
        val list1: ListNode<Int>?,
        val list2: ListNode<Int>?
    )
}
