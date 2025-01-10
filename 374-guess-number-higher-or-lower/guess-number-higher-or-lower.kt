class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var max = n
        var min = 1
        while(true) {
            val mid = min + (max - min) / 2
            val guess = guess(mid)
            when(guess(mid)) {
                -1 -> max = mid - 1
                1 -> min = mid + 1
                0 -> return mid
            }
        }
    }
}