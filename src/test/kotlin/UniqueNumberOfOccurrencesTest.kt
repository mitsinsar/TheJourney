import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.UniqueNumberOfOccurrences

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UniqueNumberOfOccurrencesTest {

    private val uniqueNumberOfOccurrences = UniqueNumberOfOccurrences()

    @Test
    fun firstScenario() {
        val input = intArrayOf(1, 2, 2, 1, 1, 3)

        val result = uniqueNumberOfOccurrences(input)

        val expectedResult = true
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = intArrayOf(1, 2)

        val result = uniqueNumberOfOccurrences(input)
        val expectedResult = false
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)

        val result = uniqueNumberOfOccurrences(input)
        val expectedResult = true
        assert(result == expectedResult)
    }
}
