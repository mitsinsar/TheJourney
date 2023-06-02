import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.IsSubsequence

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IsSubsequenceTest {

    private val isSubsequence = IsSubsequence()

    @Test
    fun firstScenario() {
        val args = IsSubsequence.IsSubsequenceArgs(subsequence = "abc", text = "ahbgdc")

        val result = isSubsequence(args)

        val expectedResult = true
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val args = IsSubsequence.IsSubsequenceArgs(subsequence = "axc", text = "ahbgdc")

        val result = isSubsequence(args)

        val expectedResult = false
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val args = IsSubsequence.IsSubsequenceArgs(subsequence = "b", text = "abc")

        val result = isSubsequence(args)

        val expectedResult = true
        assert(result == expectedResult)
    }
}
