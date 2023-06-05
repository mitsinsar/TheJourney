import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.FindTheDifferenceOfTwoArrays

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindTheDifferenceOfTwoArraysTest {

    private val findTheDifferenceOfTwoArrays = FindTheDifferenceOfTwoArrays()

    @Test
    fun firstScenario() {
        val args = FindTheDifferenceOfTwoArrays.FindTheDifferenceOfTwoArraysArgs(
            firstArray = intArrayOf(1, 2, 3),
            secondArray = intArrayOf(2, 4, 6)
        )

        val result = findTheDifferenceOfTwoArrays(args)

        val expectedResult = listOf(listOf(1, 3), listOf(4, 6))

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val args = FindTheDifferenceOfTwoArrays.FindTheDifferenceOfTwoArraysArgs(
            firstArray = intArrayOf(1, 2, 3, 3),
            secondArray = intArrayOf(1, 1, 2, 2)
        )

        val result = findTheDifferenceOfTwoArrays(args)

        val expectedResult = listOf(listOf(3), listOf())

        assert(result == expectedResult)
    }
}
