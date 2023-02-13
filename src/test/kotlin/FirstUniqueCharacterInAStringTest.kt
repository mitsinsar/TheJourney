import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.FirstUniqueCharacterInAString

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FirstUniqueCharacterInAStringTest {

    private lateinit var firstUniqueCharacterInAString: FirstUniqueCharacterInAString

    @BeforeAll
    fun setupFirstUniqueCharacterInAString() {
        firstUniqueCharacterInAString = FirstUniqueCharacterInAString()
    }

    @Test
    fun firstScenario() {
        val input = "leetcode"
        val result = firstUniqueCharacterInAString(input)
        val expectedResult = 0
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = "loveleetcode"
        val result = firstUniqueCharacterInAString(input)
        val expectedResult = 2
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = "aabb"
        val result = firstUniqueCharacterInAString(input)
        val expectedResult = -1
        assert(result == expectedResult)
    }
}
