import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.PalindromeNumber

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromeNumberTest {

    private lateinit var palindromeNumber: PalindromeNumber

    @BeforeAll
    fun initPalindromeNumber() {
        palindromeNumber = PalindromeNumber()
    }

    @Test
    fun firstScenario() {
        // Given
        val input = 121

        // When
        val isPalindrome = palindromeNumber(input)

        // Then
        val expectedResult = true

        assert(isPalindrome == expectedResult)
    }

    @Test
    fun secondScenario() {
        // Given
        val input = -121

        // When
        val isPalindrome = palindromeNumber(input)

        // Then
        val expectedResult = false

        assert(isPalindrome == expectedResult)
    }

    @Test
    fun thirdScenario() {
        // Given
        val input = 10

        // When
        val isPalindrome = palindromeNumber(input)

        // Then
        val expectedResult = false

        assert(isPalindrome == expectedResult)
    }
}
