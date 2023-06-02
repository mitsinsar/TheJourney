import org.junit.jupiter.api.TestInstance
import solutions.CanPlaceFlowers
import kotlin.test.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CanPlaceFlowersTest {

    private val canPlaceFlowers = CanPlaceFlowers()

    @Test
    fun firstScenario() {
        val args = CanPlaceFlowers.CanPlaceFlowersArgs(intArrayOf(1, 0, 0, 0, 1), newFlowers = 1)

        val result = canPlaceFlowers(args)

        val expectedResult = true
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val args = CanPlaceFlowers.CanPlaceFlowersArgs(intArrayOf(1, 0, 0, 0, 1), newFlowers = 2)

        val result = canPlaceFlowers(args)

        val expectedResult = false
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val args = CanPlaceFlowers.CanPlaceFlowersArgs(intArrayOf(1, 0, 0, 0, 0, 1), newFlowers = 2)

        val result = canPlaceFlowers(args)

        val expectedResult = false
        assert(result == expectedResult)
    }

    @Test
    fun forthScenario() {
        val args = CanPlaceFlowers.CanPlaceFlowersArgs(intArrayOf(0, 0, 1, 0, 0), newFlowers = 1)

        val result = canPlaceFlowers(args)

        val expectedResult = true
        assert(result == expectedResult)
    }
}
