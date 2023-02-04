package solutions

import core.Executable

class LongestCommonPrefix : Executable<Array<String>, String> {

    override fun invoke(args: Array<String>): String {
        if (args.size == 1) return args.first()
        var commonPrefix = args.first()
        args.forEach { word ->
            while (true) {
                if (word.startsWith(commonPrefix) || commonPrefix == "") {
                    break
                } else {
                    commonPrefix = commonPrefix.dropLast(1)
                }
            }
            if (commonPrefix == "") return@forEach
        }
        return commonPrefix
    }
}
