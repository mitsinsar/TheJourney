import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.RemoveLetterToEqualizeFrequency

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveLetterToEqualizeFrequencyTest {

    private lateinit var removeLetterToEqualizeFrequency: RemoveLetterToEqualizeFrequency

    @BeforeAll
    fun initRemoveLetterToEqualizeFrequency() {
        removeLetterToEqualizeFrequency = RemoveLetterToEqualizeFrequency()
    }

    @Test
    fun firstScenario() {
        // Given
        val word = "abcc"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        // Given
        val word = "aazz"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = false

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        // Given
        val word = "abc"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun forthScenario() {
        // Given
        val word = "abbcc"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun fifthScenario() {
        // Given
        val word = "aa"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun sixthScenario() {
        // Given
        val word = "cccd"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun seventhScenario() {
        // Given
        val word = "cccaa"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = true

        assert(result == expectedResult)
    }

    @Test
    fun eightScenario() {
        // Given
        val word = "ddaccb"

        // When
        val result = removeLetterToEqualizeFrequency(word)

        // Then
        val expectedResult = false

        assert(result == expectedResult)
    }
}
