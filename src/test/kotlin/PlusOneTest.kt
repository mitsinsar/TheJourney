import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.PlusOne

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PlusOneTest {

    private lateinit var plusOne: PlusOne

    @BeforeAll
    fun initPlusOne() {
        plusOne = PlusOne()
    }

    @Test
    fun firstScenario() {
        // Given
        val intArray = intArrayOf(1, 2, 3)

        // When
        val result = plusOne(intArray)

        // Then
        val expectedResult = intArrayOf(1, 2, 4)

        assert(result.contentEquals(expectedResult))
    }

    @Test
    fun secondScenario() {
        // Given
        val intArray = intArrayOf(4, 3, 2, 1)

        // When
        val result = plusOne(intArray)

        // Then
        val expectedResult = intArrayOf(4, 3, 2, 2)

        assert(result.contentEquals(expectedResult))
    }

    @Test
    fun thirdScenario() {
        // Given
        val intArray = intArrayOf(9)

        // When
        val result = plusOne(intArray)

        // Then
        val expectedResult = intArrayOf(1, 0)

        assert(result.contentEquals(expectedResult))
    }
}
