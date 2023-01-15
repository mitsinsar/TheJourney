import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ReverseString

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReverseStringTest {

    private lateinit var reverseString: ReverseString

    @BeforeAll
    fun initReverseString() {
        reverseString = ReverseString()
    }

    @Test
    fun firstScenario() {
        val input = "hello".toCharArray()
        val result = reverseString.invoke(input)
        val expectedResult = "olleh".toCharArray()

        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun secondScenario() {
        val input = "Hannah".toCharArray()
        val result = reverseString.invoke(input)
        val expectedResult = "hannaH".toCharArray()

        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun forthScenario() {
        val input = "A man, a plan, a canal: Panama".toCharArray()
        val result = reverseString.invoke(input)
        val expectedResult = "amanaP :lanac a ,nalp a ,nam A".toCharArray()

        assert(expectedResult.contentEquals(result))
    }

    @Test
    fun fifthScenario() {
        val input = "Carbon".toCharArray()
        val result = reverseString.invoke(input)
        val expectedResult = "nobraC".toCharArray()

        assert(expectedResult.contentEquals(result))
    }
}
