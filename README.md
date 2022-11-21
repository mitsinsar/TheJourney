# The Journey

Purpose of this repository to keep my [LeetCode](https://leetcode.com) problem solutions in a single place to use as a reminder and to share with other devs.

## Resources

There is a section called `Resources` where you can find useful information to solve problems in an efficient way.

## Testing

Test were written based on LeetCode test cases and can be found under `src/test/kotlin/XTest.kt` where `X` represents
the problem name.

## Additional info

Solutions
implements [Executable](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/core/Executable.kt)
interface which is not related to LeetCode solutions. Purpose of this interface to ensure consistency between problems

```
class ProblemName : Executable<ProblemArgs, ProblemReturnType> {

    override operator fun invoke(args: ProblemArgs): ProblemReturnType {
        ...
    }

    data class ProblemArgs(...)
}


// To call
val problemNameInstance = ProblemName()

val args: ProblemArgs = ProblemArgs(...)
val result: ProblemReturnType = problemNameInstance(args)
```

## Solved Problems

| Problem                                                              | Solution                                                                                                           | Problem Test                                                                                                     | Submission                                                                                                     | Related Resource                                                                       |
|----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|
| [1. Two Sum](https://leetcode.com/problems/two-sum/)                 | [TwoSum.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/TwoSum.kt)               | [TwoSumTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/TwoSumTest.kt)               | [R: 431 ms 49.67%<br/>M: 43.2 MB 27.72%](https://leetcode.com/problems/two-sum/submissions/838908240/)         | [HashMap.md](https://github.com/mitsinsar/TheJourney/blob/master/resources/HashMap.md) |
| [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [AddTwoNumbers.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/AddTwoNumbers.kt) | [AddTwoNumbersTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/AddTwoNumbersTest.kt) | [R: 255 ms 86.11%<br/>M: 42.5 MB 89.72%](https://leetcode.com/problems/add-two-numbers/submissions/847667456/) |                                                                                        |                                                                                        |
