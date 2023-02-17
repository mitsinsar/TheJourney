import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.PowerOfThree

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PowerOfThreeTest {

    private lateinit var powerOfThree: PowerOfThree

    @BeforeAll
    fun setupPowerOfThree() {
        powerOfThree = PowerOfThree()
    }

    @Test
    fun firstScenario() {
        val input = 27
        val result = powerOfThree(input)
        val expectedResult = true
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = 0
        val result = powerOfThree(input)
        val expectedResult = false
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = -1
        val result = powerOfThree(input)
        val expectedResult = false
        assert(result == expectedResult)
    }
}
