import core.ListNode
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.MergeTwoSortedLists

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MergeTwoSortedListTest {

    private lateinit var mergeTwoSortedLists: MergeTwoSortedLists

    @BeforeAll
    fun initMergeTwoSortedList() {
        mergeTwoSortedLists = MergeTwoSortedLists()
    }

    @Test
    fun firstScenario() {
        // Given
        val firstListNode = ListNode.createListNodes(listOf(1, 2, 4))
        val secondListNode = ListNode.createListNodes(listOf(1, 3, 4))

        // When
        val args = MergeTwoSortedLists.MergeTwoSortedListsArgs(firstListNode, secondListNode)
        val result = mergeTwoSortedLists(args)

        // Then
        val expectedResult = ListNode.createListNodes(listOf(1, 1, 2, 3, 4, 4))

        assert(expectedResult == result)
    }

    @Test
    fun secondScenario() {
        // Given
        val firstListNode = null
        val secondListNode = null

        // When
        val args = MergeTwoSortedLists.MergeTwoSortedListsArgs(firstListNode, secondListNode)
        val result = mergeTwoSortedLists(args)

        // Then
        val expectedResult = null

        assert(expectedResult == result)
    }

    @Test
    fun thirdScenario() {
        // Given
        val firstListNode = null
        val secondListNode = ListNode.createListNodes(listOf(0))

        // When
        val args = MergeTwoSortedLists.MergeTwoSortedListsArgs(firstListNode, secondListNode)
        val result = mergeTwoSortedLists(args)

        // Then
        val expectedResult = ListNode.createListNodes(listOf(0))

        assert(expectedResult == result)
    }
}
