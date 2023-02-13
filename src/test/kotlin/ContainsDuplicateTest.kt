import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ContainsDuplicate

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContainsDuplicateTest {

    private lateinit var containsDuplicate: ContainsDuplicate

    @BeforeAll
    fun setupContainsDuplicate() {
        containsDuplicate = ContainsDuplicate()
    }

    @Test
    fun firstScenario() {
        val input = intArrayOf(1, 2, 3, 1)
        val result = containsDuplicate(input)
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = intArrayOf(1, 2, 3, 4)
        val result = containsDuplicate(input)
        val expectedResult = false

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val result = containsDuplicate(input)
        val expectedResult = true

        assert(result == expectedResult)
    }
}
