class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val answer = mutableListOf<Boolean>()
        candies.forEach {
            if (it + extraCandies >= max) {
                answer.add(true)
            } else {
                answer.add(false)
            }
        }
        return answer
    }
}