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

| Problem                                                                                                         | Solution                                                                                                                                               | Problem Test                                                                                                                                         | Related Resource                                                                                                   |
|-----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|
| [1. Two Sum](https://leetcode.com/problems/two-sum/)                                                            | [TwoSum.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/TwoSum.kt)                                                   | [TwoSumTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/TwoSumTest.kt)                                                   | [HashMap.md](https://github.com/mitsinsar/TheJourney/blob/master/resources/HashMap.md)                             |
| [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)                                            | [AddTwoNumbers.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/AddTwoNumbers.kt)                                     | [AddTwoNumbersTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/AddTwoNumbersTest.kt)                                     |                                                                                                                    |                                                                                        ||                                                                          |                                                                                                                          |                                                                                                                        |                                                                                        |
| [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/)                                        | [PalindromeNumber.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/PalindromeNumber.kt)                               | [PalindromeNumberTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/PalindromeNumberTest.kt)                               |                                                                                                                    |
| [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)                                         | [RomanToInteger.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/RomanToInteger.kt)                                   | [RomanToIntegerTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/RomanToIntegerTest.kt)                                   | [VariableOrNotVariable.md](https://github.com/mitsinsar/TheJourney/blob/master/resources/VariableOrNotVariable.md) |
| [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)                                       | [ValidParentheses.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/ValidParentheses.kt)                               | [ValidParenthesesTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/ValidParenthesesTest.kt)                               |                                                                                                                    |
| [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)                             | [MergeTwoSortedLists.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/MergeTwoSortedLists.kt)                         | [MergeTwoSortedListsTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/MergeTwoSortedListsTest.kt)                         |                                                                                                                    |
| [66. Plus One](https://leetcode.com/problems/plus-one/)                                                         | [PlusOne.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/PlusOne.kt)                                                 | [PlusOneTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/PlusOneTest.kt)                                                 |                                                                                                                    |
| [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)                                  | [ReverseLinkedList.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/ReverseLinkedList.kt)                             | [ReverseLinkedListTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/ReverseLinkedListTest.kt)                             |                                                                                                                    |                                                                                                                    |
| [344. Reverse String](https://leetcode.com/problems/reverse-string/)                                            | [ReverseString.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/ReverseString.kt)                                     | [ReverseStringTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/ReverseStringTest.kt)                                     |                                                                                                                    |
| [2423. Remove Letter To Equalize Frequency](https://leetcode.com/problems/remove-letter-to-equalize-frequency/) | [RemoveLetterToEqualizeFrequency.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/RemoveLetterToEqualizeFrequency.kt) | [RemoveLetterToEqualizeFrequencyTest.kt](https://github.com/mitsinsar/TheJourney/blob/master/src/test/kotlin/RemoveLetterToEqualizeFrequencyTest.kt) |                                                                                                                    |
