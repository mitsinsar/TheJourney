import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.SingleNumber

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SingleNumberTest {

    private lateinit var singleNumber: SingleNumber

    @BeforeAll
    fun initSingleNumber() {
        singleNumber = SingleNumber()
    }

    @Test
    fun firstScenario() {
        val input = intArrayOf(2, 2, 1)
        val result = singleNumber(input)
        val expectedResult = 1
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = intArrayOf(4, 1, 2, 1, 2)
        val result = singleNumber(input)
        val expectedResult = 4
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = intArrayOf(1)
        val result = singleNumber(input)
        val expectedResult = 1
        assert(result == expectedResult)
    }
}
