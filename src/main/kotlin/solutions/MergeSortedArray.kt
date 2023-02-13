package solutions

import core.Executable

class MergeSortedArray : Executable<MergeSortedArray.MergeSortedArrayArgs, IntArray> {

    override fun invoke(args: MergeSortedArrayArgs): IntArray {
        val nums1 = args.firstArray
        val nums2 = args.secondArray

        var nums1ItemIndex = args.firstArraySize - 1
        var nums2ItemIndex = args.secondArraySize - 1
        var lastPositionOfNums1 = args.firstArray.size - 1

        while (nums2ItemIndex >= 0) {
            nums1[lastPositionOfNums1] = if (nums1ItemIndex >= 0 && nums1[nums1ItemIndex] > nums2[nums2ItemIndex]) {
                nums1[nums1ItemIndex].also { nums1ItemIndex -= 1 }
            } else {
                nums2[nums2ItemIndex].also { nums2ItemIndex -= 1 }
            }
            lastPositionOfNums1 -= 1
        }
        return nums1
    }

    data class MergeSortedArrayArgs(
        val firstArray: IntArray,
        val firstArraySize: Int,
        val secondArray: IntArray,
        val secondArraySize: Int
    )
}
