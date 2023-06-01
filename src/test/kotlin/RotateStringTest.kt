import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.RotateString

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RotateStringTest {

    private lateinit var rotateString: RotateString

    @BeforeAll
    fun setupRotateString() {
        rotateString = RotateString()
    }

    @Test
    fun firstScenario() {
        val input = "abcde"
        val goal = "cdeab"
        val args = RotateString.RotateStringArgs(input, goal)

        val result = rotateString(args)
        val expectedResult = true

        assert(expectedResult == result)
    }

    @Test
    fun secondScenario() {
        val input = "abcde"
        val goal = "abced"
        val args = RotateString.RotateStringArgs(input, goal)

        val result = rotateString(args)
        val expectedResult = false

        assert(expectedResult == result)
    }

    @Test
    fun thirdScenario() {
        val input = "aa"
        val goal = "a"
        val args = RotateString.RotateStringArgs(input, goal)

        val result = rotateString(args)
        val expectedResult = false

        assert(expectedResult == result)
    }
}
