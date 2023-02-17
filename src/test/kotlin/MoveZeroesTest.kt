import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.MoveZeroes

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MoveZeroesTest {

    private lateinit var moveZeroes: MoveZeroes

    @BeforeAll
    fun setupMoveZeroes() {
        moveZeroes = MoveZeroes()
    }

    @Test
    fun firstScenario() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        val result = moveZeroes(input)
        val expectedResult = intArrayOf(1, 3, 12, 0, 0)
        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun secondScenario() {
        val input = intArrayOf(0)
        val result = moveZeroes(input)
        val expectedResult = intArrayOf(0)
        assert(expectedResult.contentEquals(result))
    }
}
