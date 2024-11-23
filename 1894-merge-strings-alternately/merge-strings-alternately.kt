
class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val list: MutableList<Char> = mutableListOf()

        var index = 0
        val firstSize = word1.length - 1
        val secoondSize: Int = word2.length - 1

        while (true) {
            if (firstSize >= index) {
                list.add(word1[index])
            }
            if (secoondSize >= index) {
                list.add(word2[index])
            }
            index += 1
            if (index > firstSize && index > secoondSize) {
                break
            }
        }

        return list.joinToString("")
    }
}