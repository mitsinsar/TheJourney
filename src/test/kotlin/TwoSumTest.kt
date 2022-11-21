import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TwoSumTest {

    private lateinit var twoSum: TwoSum

    @BeforeAll
    fun initTwoSum() {
        twoSum = TwoSum()
    }

    @Test
    fun firstScenario() {
        // Given
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        // When
        val twoSumArgs = TwoSum.TwoSumArgs(nums, target)
        val result: IntArray = twoSum(twoSumArgs)

        // Then
        val expectedResult = intArrayOf(0, 1)
        assert(result.contentEquals(expectedResult))
    }

    @Test
    fun secondScenario() {
        // Given
        val nums = intArrayOf(3, 2, 4)
        val target = 6

        // When
        val twoSumArgs = TwoSum.TwoSumArgs(nums, target)
        val result: IntArray = twoSum(twoSumArgs)

        // Then
        val expectedResult = intArrayOf(1, 2)
        assert(result.contentEquals(expectedResult))
    }

    @Test
    fun thirdScenario() {
        // Given
        val nums = intArrayOf(3, 3)
        val target = 6

        // When
        val twoSumArgs = TwoSum.TwoSumArgs(nums, target)
        val result: IntArray = twoSum(twoSumArgs)

        // Then
        val expectedResult = intArrayOf(0, 1)
        assert(result.contentEquals(expectedResult))
    }
}
