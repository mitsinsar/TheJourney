import core.ListNode
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ReverseLinkedList

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReverseLinkedListTest {

    private lateinit var reverseLinkedList: ReverseLinkedList

    @BeforeAll
    fun initReverseLinkedList() {
        reverseLinkedList = ReverseLinkedList()
    }

    @Test
    fun firstScenario() {
        val input = ListNode.createListNodes(listOf(1, 2, 3, 4, 5))
        val output = reverseLinkedList.invoke(input)
        val expectedResult = ListNode.createListNodes(listOf(5, 4, 3, 2, 1))
        assert(output == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = ListNode.createListNodes(listOf(1, 2))
        val output = reverseLinkedList.invoke(input)
        val expectedResult = ListNode.createListNodes(listOf(2, 1))
        assert(output == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = null
        val output = reverseLinkedList.invoke(input)
        val expectedResult = null
        assert(output == expectedResult)
    }

    @Test
    fun fourthScenario() {
        val input = ListNode.createListNodes(listOf(1))
        val output = reverseLinkedList.invoke(input)
        val expectedResult = ListNode.createListNodes(listOf(1))
        assert(output == expectedResult)
    }
}
