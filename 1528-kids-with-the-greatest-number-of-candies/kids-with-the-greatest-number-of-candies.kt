class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var highest = candies[0]
        for (element in candies) {
            highest = max(highest, element)
        }

        val answer = ArrayList<Boolean>()
        for (i in candies) {
            answer.add(i + extraCandies >= highest)
        }
        return answer
    }
}