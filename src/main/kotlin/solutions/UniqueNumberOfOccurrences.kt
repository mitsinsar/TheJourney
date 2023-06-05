package solutions

import core.Executable

class UniqueNumberOfOccurrences : Executable<IntArray, Boolean> {

    override fun invoke(args: IntArray): Boolean {
        val frequencyMap = hashMapOf<Int, Int>()

        args.forEach {
            frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1
        }
        val frequencySet = hashSetOf<Int>()

        frequencyMap.values.forEach {
            if (!frequencySet.add(it)) return false
        }
        return frequencySet.size == frequencyMap.size
    }
}
