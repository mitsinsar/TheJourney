package core

data class ListNode<T>(val value: T) {

    var next: ListNode<T>? = null

    companion object {
        fun <T> createListNodes(nodeValueList: List<T>): ListNode<T> {
            return ListNode(nodeValueList[0]).apply {
                if (nodeValueList.size > 1) {
                    val newNodeValueList = nodeValueList.subList(1, nodeValueList.size)
                    if (newNodeValueList.isNotEmpty()) next = createListNodes(newNodeValueList)
                }
            }
        }
    }
}
