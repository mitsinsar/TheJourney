import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.FizzBuzz

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FizzBuzzTest {

    private lateinit var fizzBuzz: FizzBuzz

    @BeforeAll
    fun setupFizzBuzz() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun firstScenario() {
        val input = 3
        val result = fizzBuzz(input)
        val expectedResult = listOf("1", "2", "Fizz")

        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = 5
        val result = fizzBuzz(input)
        val expectedResult = listOf("1", "2", "Fizz", "4", "Buzz")

        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = 15
        val result = fizzBuzz(input)
        val expectedResult = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
        )

        assert(result == expectedResult)
    }
}
