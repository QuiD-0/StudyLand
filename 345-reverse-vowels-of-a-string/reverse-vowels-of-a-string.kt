class Solution {
        fun reverseVowels(s: String): String {
        val arr = arrayOf('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I')
        val words = s.toCharArray()
        val indexArr = mutableListOf<Int>()
        val vowelArr = mutableListOf<Char>()
        words.forEachIndexed { index, e ->
            if (arr.contains(e)) {
                indexArr.add(index)
                vowelArr.add(e)
            }
        }
        indexArr.reversed().forEachIndexed { index: Int, i: Int ->
            words[i] = vowelArr[index]
        }
        return words.joinToString("")
    }
}