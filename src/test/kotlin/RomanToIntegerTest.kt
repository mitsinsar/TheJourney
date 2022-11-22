import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.RomanToInteger

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RomanToIntegerTest {

    private lateinit var romanToInteger: RomanToInteger

    @BeforeAll
    fun initRomanToInteger() {
        romanToInteger = RomanToInteger()
    }

    @Test
    fun firstScenario() {
        // Given
        val romanInput = "III"

        // When
        val result = romanToInteger(romanInput)

        // Then
        val expectedResult = 3

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        // Given
        val romanInput = "LVIII"

        // When
        val result = romanToInteger(romanInput)

        // Then
        val expectedResult = 58

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        // Given
        val romanInput = "MCMXCIV"

        // When
        val result = romanToInteger(romanInput)

        print(result)
        // Then
        val expectedResult = 1994

        assert(result == expectedResult)
    }
}
