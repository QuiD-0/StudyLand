class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val answer = mutableListOf<Boolean>()
        for (i in candies){
            answer.add(i + extraCandies >= max)
        }
        return answer
    }
}