package solutions

import core.Executable

class ExcelSheetColumnNumber : Executable<String, Int> {

    override fun invoke(args: String): Int {
        val baseNumber = 64
        var columnCount = 0
        args.reversed().forEachIndexed { index, char ->
            columnCount += calculatePowerOfChars(index) * (char.code - baseNumber)
        }
        return columnCount
    }

    private fun calculatePowerOfChars(pow: Int): Int {
        var result = 1
        var exponent = pow
        while (exponent != 0) {
            result *= 26
            --exponent
        }
        return result
    }
}
