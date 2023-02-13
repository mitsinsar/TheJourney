import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.MergeSortedArray

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MergeSortedArrayTest {

    private lateinit var mergeSortedArray: MergeSortedArray

    @BeforeAll
    fun setupMergeSortedArray() {
        mergeSortedArray = MergeSortedArray()
    }

    @Test
    fun firstScenario() {
        val input = MergeSortedArray.MergeSortedArrayArgs(
            firstArray = intArrayOf(1, 2, 3, 0, 0, 0),
            firstArraySize = 3,
            secondArray = intArrayOf(2, 5, 6),
            secondArraySize = 3
        )
        val result = mergeSortedArray(input)
        val expectedResult = intArrayOf(1, 2, 2, 3, 5, 6)
        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun secondScenario() {
        val input = MergeSortedArray.MergeSortedArrayArgs(
            firstArray = intArrayOf(1),
            firstArraySize = 1,
            secondArray = intArrayOf(),
            secondArraySize = 0
        )
        val result = mergeSortedArray(input)
        val expectedResult = intArrayOf(1)
        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun thirdScenario() {
        val input = MergeSortedArray.MergeSortedArrayArgs(
            firstArray = intArrayOf(0),
            firstArraySize = 0,
            secondArray = intArrayOf(1),
            secondArraySize = 1
        )
        val result = mergeSortedArray(input)
        val expectedResult = intArrayOf(1)
        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun forthScenario() {
        val input = MergeSortedArray.MergeSortedArrayArgs(
            firstArray = intArrayOf(2, 0),
            firstArraySize = 1,
            secondArray = intArrayOf(1),
            secondArraySize = 1
        )
        val result = mergeSortedArray(input)
        val expectedResult = intArrayOf(1, 2)
        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun fifthScenario() {
        val input = MergeSortedArray.MergeSortedArrayArgs(
            firstArray = intArrayOf(4, 5, 6, 0, 0, 0),
            firstArraySize = 3,
            secondArray = intArrayOf(1, 2, 3),
            secondArraySize = 3
        )
        val result = mergeSortedArray(input)
        val expectedResult = intArrayOf(1, 2, 3, 4, 5, 6)
        assert(expectedResult.contentEquals(result))
    }
}
