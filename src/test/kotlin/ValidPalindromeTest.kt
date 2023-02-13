import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ValidPalindrome

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidPalindromeTest {

    private lateinit var validPalindrome: ValidPalindrome

    @BeforeAll
    fun setupValidPalindrome() {
        validPalindrome = ValidPalindrome()
    }

    @Test
    fun firstScenario() {
        val input = "A man, a plan, a canal: Panama"
        val result = validPalindrome(input)
        val expectedResult = true // amanaplanacanalpanama
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = "race a car"
        val result = validPalindrome(input)
        val expectedResult = false // raceacar
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = " "
        val result = validPalindrome(input)
        val expectedResult = true
        assert(result == expectedResult)
    }
}
