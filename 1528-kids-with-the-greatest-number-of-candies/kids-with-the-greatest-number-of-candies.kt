class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val answer = mutableListOf<Boolean>()
        for(i in 0..candies.size-1) {
            answer.add((candies[i]+extraCandies >= max))
        }
        return answer
    }
}