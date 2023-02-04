import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.LongestCommonPrefix

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LongestCommonPrefixTest {

    private lateinit var longestCommonPrefix: LongestCommonPrefix

    @BeforeAll
    fun setupLongestCommonPrefix() {
        longestCommonPrefix = LongestCommonPrefix()
    }

    @Test
    fun firstScenario() {
        val input = arrayOf("flower", "flow", "flight")
        val result = longestCommonPrefix(input)
        val expectedResult = "fl"
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = arrayOf("dog", "racecar", "car")
        val result = longestCommonPrefix(input)
        val expectedResult = ""
        assert(result == expectedResult)
    }
}
