import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.MajorityElement

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MajorityElementTest {

    private lateinit var majorityElement: MajorityElement

    @BeforeAll
    fun setupMajorityElement() {
        majorityElement = MajorityElement()
    }

    @Test
    fun firstScenario() {
        val input = intArrayOf(3, 2, 3)
        val result = majorityElement(input)
        val expectedResult = 3
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        val result = majorityElement(input)
        val expectedResult = 2
        assert(result == expectedResult)
    }
}
