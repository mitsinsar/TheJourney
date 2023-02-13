import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ClimbingStairs

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ClimbingStairsTest {

    private lateinit var climbingStairs: ClimbingStairs

    @BeforeAll
    fun setupClimbingStairs() {
        climbingStairs = ClimbingStairs()
    }

    @Test
    fun firstScenario() {
        val input = 2
        val result = climbingStairs(input)
        val expectedResult = 2
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = 3
        val result = climbingStairs(input)
        val expectedResult = 3
        assert(result == expectedResult)
    }
}
