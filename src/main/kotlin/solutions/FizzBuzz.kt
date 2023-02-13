package solutions

import core.Executable

class FizzBuzz : Executable<Int, List<String>> {

    override fun invoke(args: Int): List<String> {
        return mutableListOf<String>().apply {
            for (count in 1..args) {
                var result = ""
                if (count % 3 == 0) result = "Fizz"
                if (count % 5 == 0) result += "Buzz"
                if (result.isEmpty()) result = count.toString()
                add(result)
            }
        }
    }
}
