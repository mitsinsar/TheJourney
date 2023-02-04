import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.ExcelSheetColumnNumber

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ExcelSheetColumnNumberTest {

    private lateinit var excelSheetColumnNumber: ExcelSheetColumnNumber

    @BeforeAll
    fun setupExcelSheetColumnNumber() {
        excelSheetColumnNumber = ExcelSheetColumnNumber()
    }

    @Test
    fun firstScenario() {
        val input = "A"
        val result = excelSheetColumnNumber(input)
        val expectedResult = 1
        assert(result == expectedResult)
    }

    @Test
    fun secondScenario() {
        val input = "AB"
        val result = excelSheetColumnNumber(input)
        val expectedResult = 28
        assert(result == expectedResult)
    }

    @Test
    fun thirdScenario() {
        val input = "ZY"
        val result = excelSheetColumnNumber(input)
        val expectedResult = 701
        assert(result == expectedResult)
    }
}
