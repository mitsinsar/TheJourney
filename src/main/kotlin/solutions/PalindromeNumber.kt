package solutions

import core.Executable

/**

https://leetcode.com/problems/palindrome-number/

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
 */

class PalindromeNumber : Executable<Int, Boolean> {

    override fun invoke(args: Int): Boolean {
        // Negative numbers can't be palindrome
        // if last digit is 0, then can't be palindrome except if its number is 0.
        var number = args
        if (number < 0 || (number % 10 == 0 && number != 0)) return false

        var reverseNumber = 0
        // Iterate until number is less than reverse number. Let's say input is 171. We are going to iterate until
        // reverse number is 17 and number is 1
        while (number > reverseNumber) {
            reverseNumber = reverseNumber * 10 + number % 10
            number /= 10
        }

        return number == reverseNumber || number == reverseNumber / 10
    }
}
