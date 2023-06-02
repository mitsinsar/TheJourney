import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.KidsWithTheGreatestNumberOfCandies
import solutions.KidsWithTheGreatestNumberOfCandies.KidsWithTheGreatestNumberOfCandiesArgs

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KidsWithTheGreatestNumberOfCandiesTest {

    private lateinit var kidsWithTheGreatestNumberOfCandies: KidsWithTheGreatestNumberOfCandies

    @BeforeAll
    fun setupKidsWithTheGreatestNumberOfCandies() {
        kidsWithTheGreatestNumberOfCandies = KidsWithTheGreatestNumberOfCandies()
    }

    @Test
    fun firstScenario() {
        val args = KidsWithTheGreatestNumberOfCandiesArgs(candies = intArrayOf(4, 2, 1, 1, 2), extraCandies = 1)
        val result = kidsWithTheGreatestNumberOfCandies(args)

        val expectedResult = listOf(true, false, false, false, false)

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val args = KidsWithTheGreatestNumberOfCandiesArgs(candies = intArrayOf(12, 1, 12), extraCandies = 3)
        val result = kidsWithTheGreatestNumberOfCandies(args)

        val expectedResult = listOf(true, false, true)

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val args = KidsWithTheGreatestNumberOfCandiesArgs(candies = intArrayOf(2, 3, 5, 1, 3), extraCandies = 3)
        val result = kidsWithTheGreatestNumberOfCandies(args)

        val expectedResult = listOf(true, true, true, false, true)

        assert(result == expectedResult)
    }
}
