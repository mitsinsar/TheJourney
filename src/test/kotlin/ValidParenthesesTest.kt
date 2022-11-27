import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ValidParentheses

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidParenthesesTest {

    private lateinit var validParentheses: ValidParentheses

    @BeforeAll
    fun initValidParentheses() {
        validParentheses = ValidParentheses()
    }

    @Test
    fun firstScenario() {
        // Given
        val inputString = "()"

        // When
        val result = validParentheses(inputString)

        //Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        // Given
        val inputString = "()[]{}"

        // When
        val result = validParentheses(inputString)

        //Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        // Given
        val inputString = "(]"

        // When
        val result = validParentheses(inputString)

        //Then
        val expectedResult = false

        assert(result == expectedResult)
    }
}
