package solutions

import core.Executable
import core.ListNode

class ReverseLinkedList : Executable<ListNode<Int>?, ListNode<Int>?> {

    override fun invoke(args: ListNode<Int>?): ListNode<Int>? {
        if (args == null) return null
        var reversedListNode = createReversedListNode(args, ListNode(args.value))
        var currentNode = args.next
        while (currentNode?.next?.value != null) {
            reversedListNode = createReversedListNode(currentNode, reversedListNode!!)
            currentNode = currentNode.next
        }
        return reversedListNode
    }

    private fun createReversedListNode(currentNode: ListNode<Int>, previousNode: ListNode<Int>): ListNode<Int>? {
        if (currentNode.next == null) return ListNode(currentNode.value)
        return ListNode(currentNode.next?.value ?: return null).apply {
            next = previousNode
        }
    }
}
