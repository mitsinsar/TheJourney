package solutions

import core.Executable

class ReverseString : Executable<CharArray, CharArray> {

    override fun invoke(args: CharArray): CharArray {
        repeat(args.size / 2) { index ->
            args[args.size - index - 1] = args[index].also { args[index] = args[args.size - index - 1] }
        }
        return args
    }
}
