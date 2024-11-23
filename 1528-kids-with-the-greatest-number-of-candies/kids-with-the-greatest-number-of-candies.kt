class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = candies[0]
        val answer = ArrayList<Boolean>()
        for(i in 0..candies.size-1) {
            max = Math.max(max, candies[i])
        }
        for (i in candies){
            answer.add(i + extraCandies >= max)
        }
        return answer
    }
}