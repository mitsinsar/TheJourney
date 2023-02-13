
# Boyer-Moore Voting Algorithm

The Boyer-Moore Voting Algorithm is a linear time algorithm used to find the majority element in a list of elements. The majority element is defined as the element that appears more than n/2 times in the list, where n is the number of elements in the list.

## Complexity

The time complexity of the Boyer-Moore Voting Algorithm is O(n), where n is the number of elements in the list. This makes it a more efficient solution compared to other algorithms that have a time complexity of O(n log n) or O(n^2).


## Implementation of the Boyer-Moore Voting Algorithm in Kotlin:

```kotlin 
fun findMajorityElement(nums: IntArray): Int {
    var count = 0   
    var candidate = 0

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }
    
    return candidate
}
```
This implementation uses two variables count and candidate to keep track of the majority element. The algorithm iterates through the list of elements and updates count and candidate accordingly. If count is 0, the current element becomes the new candidate. If the current element is equal to the candidate, count is incremented, otherwise count is decremented. At the end of the iteration, the candidate is returned as the majority element.

## Conclusion

The Boyer-Moore Voting Algorithm is a simple and efficient solution for finding the majority element in a list of elements. The implementation in Kotlin is straightforward and easy to understand.