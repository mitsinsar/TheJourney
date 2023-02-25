import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ValidAnagram

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidAnagramTest {

    private lateinit var validAnagram: ValidAnagram

    @BeforeAll
    fun setupValidAnagram() {
        validAnagram = ValidAnagram()
    }

    @Test
    fun firstScenario() {
        val input = ValidAnagram.ValidAnagramArgs("anagram", "nagaram")
        val result = validAnagram(input)
        val expectedResult = true
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = ValidAnagram.ValidAnagramArgs("rat", "car")
        val result = validAnagram(input)
        val expectedResult = false
        assert(result == expectedResult)
    }
}
