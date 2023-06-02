import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import solutions.ReverseVowelsOfAString
import kotlin.test.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReverseVowelsOfAStringTest {

    private lateinit var reverseVowelsOfAString: ReverseVowelsOfAString

    @BeforeAll
    fun setupReverseVowelsOfAString() {
        reverseVowelsOfAString = ReverseVowelsOfAString()
    }

    @Test
    fun firstScenario() {
        val input = "hello"

        val result = reverseVowelsOfAString(input)

        val expectedResult = "holle"
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = "leetcode"

        val result = reverseVowelsOfAString(input)

        val expectedResult = "leotcede"
        assert(result == expectedResult)
    }
}
