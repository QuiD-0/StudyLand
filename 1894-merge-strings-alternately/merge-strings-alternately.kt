class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var answer = ""

        var index = 0
        val firstSize = word1.length - 1
        val secoondSize: Int = word2.length - 1

        while (true) {
            if (firstSize >= index) {
                answer = answer+word1[index]
            }
            if (secoondSize >= index) {
                answer = answer+word2[index]
            }
            index += 1
            if (index > firstSize && index > secoondSize) {
                break
            }
        }

        return answer
    }
}