class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val toList1 = nums1.toSet()
            .filter { nums2.contains(it).not() }
            .toList()

        val toList2 = nums2.toSet()
            .filter { nums1.contains(it).not() }            
            .toList()

        return listOf(toList1, toList2)
    }
}