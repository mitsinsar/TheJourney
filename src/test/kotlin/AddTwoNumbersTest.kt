import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.AddTwoNumbers

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddTwoNumbersTest {

    private lateinit var addTwoNumbers: AddTwoNumbers

    @BeforeAll
    fun initAddTwoNumbers() {
        addTwoNumbers = AddTwoNumbers()
    }

    @Test
    fun firstScenario() {
        // Given
        val list1 = AddTwoNumbers.createListNodes(listOf(2, 4, 3))
        val list2 = AddTwoNumbers.createListNodes(listOf(5, 6, 4))

        // When
        val addTwoNumbersArgs = AddTwoNumbers.AddTwoNumbersArgs(list1, list2)
        val result = addTwoNumbers(addTwoNumbersArgs)

        // Then
        val expectedResult = AddTwoNumbers.createListNodes(listOf(7, 0, 8))
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        // Given
        val list1 = AddTwoNumbers.createListNodes(listOf(0))
        val list2 = AddTwoNumbers.createListNodes(listOf(0))

        // When
        val addTwoNumbersArgs = AddTwoNumbers.AddTwoNumbersArgs(list1, list2)
        val result = addTwoNumbers(addTwoNumbersArgs)

        // Then
        val expectedResult = AddTwoNumbers.createListNodes(listOf(0))
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        // Given
        val list1 = AddTwoNumbers.createListNodes(listOf(9, 9, 9, 9, 9, 9, 9))
        val list2 = AddTwoNumbers.createListNodes(listOf(9, 9, 9, 9))

        // When
        val addTwoNumbersArgs = AddTwoNumbers.AddTwoNumbersArgs(list1, list2)
        val result = addTwoNumbers(addTwoNumbersArgs)

        // Then
        val expectedResult = AddTwoNumbers.createListNodes(listOf(8, 9, 9, 9, 0, 0, 0, 1))

        assert(result == expectedResult)
    }
}
