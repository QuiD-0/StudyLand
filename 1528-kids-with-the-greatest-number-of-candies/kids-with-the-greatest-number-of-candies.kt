class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val answer = mutableListOf<Boolean>()
        candies.forEach {
            answer.add(it + extraCandies >= max)
        }
        return answer
    }
}