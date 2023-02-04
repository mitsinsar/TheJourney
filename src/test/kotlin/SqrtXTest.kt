import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.SqrtX

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SqrtXTest {

    private lateinit var sqrtX: SqrtX

    @BeforeAll
    fun setupSqrtX() {
        sqrtX = SqrtX()
    }

    @Test
    fun firstScenario() {
        val input = 4
        val result = sqrtX(input)
        val expectedResult = 2
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = 8
        val result = sqrtX(input)
        val expectedResult = 2
        assert(result == expectedResult)
    }
}
