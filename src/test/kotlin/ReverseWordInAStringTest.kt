import org.junit.jupiter.api.TestInstance
import solutions.ReverseWordInAString
import kotlin.test.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReverseWordInAStringTest {

    private val reverseWordInAString = ReverseWordInAString()

    @Test
    fun firstScenario() {
        val input = "the sky is blue"

        val result = reverseWordInAString(input)

        val expectedResult = "blue is sky the"
        println(result)
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = "  hello world  "

        val result = reverseWordInAString(input)

        val expectedResult = "world hello"
        println(result)
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = "a good   example"

        val result = reverseWordInAString(input)

        val expectedResult = "example good a"
        println(result)
        assert(result == expectedResult)
    }

    @Test
    fun fourthScenario() {
        val input = "EPY2giL"

        val result = reverseWordInAString(input)

        val expectedResult = "EPY2giL"
        println(result)
        assert(result == expectedResult)
    }
}
