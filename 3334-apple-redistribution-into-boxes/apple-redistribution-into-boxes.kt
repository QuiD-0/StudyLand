class Solution {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
       capacity.sortDescending()

        var capacityIdx = 0
        var appleSize = apple.sum()

        while (appleSize > 0) {
            appleSize -= capacity[capacityIdx]
            capacityIdx += 1
        }

        return capacityIdx
    }
}