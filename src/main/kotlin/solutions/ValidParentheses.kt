package solutions

import core.Executable
import java.util.*

/**

https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

class ValidParentheses : Executable<String, Boolean> {

    override fun invoke(args: String): Boolean {
        val stack = Stack<Char>()
        args.forEach {
            when (it) {
                '(' -> stack.push(')')
                '{' -> stack.push('}')
                '[' -> stack.push(']')
                else -> if (stack.isEmpty() || stack.pop() != it) return false
            }
        }
        return stack.isEmpty()
    }
}
