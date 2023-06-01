import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import solutions.MergeStringsAlternately
import kotlin.test.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MergeStringsAlternatelyTest {

    private lateinit var mergeStringsAlternately: MergeStringsAlternately

    @BeforeAll
    fun setupMergeStringsAlternately() {
        mergeStringsAlternately = MergeStringsAlternately()
    }

    @Test
    fun firstScenario() {
        val args = MergeStringsAlternately.MergeStringsAlternatelyArgs("abc", "pqr")
        val result = mergeStringsAlternately(args)
        val expectedResult = "apbqcr"

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val args = MergeStringsAlternately.MergeStringsAlternatelyArgs("ab", "pqrs")
        val result = mergeStringsAlternately(args)
        val expectedResult = "apbqrs"

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val args = MergeStringsAlternately.MergeStringsAlternatelyArgs("abcd", "pq")
        val result = mergeStringsAlternately(args)
        val expectedResult = "apbqcd"

        assert(result == expectedResult)
    }
}
