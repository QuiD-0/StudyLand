class Solution {
  fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
    potions.sort()
    val res = IntArray(spells.size)
    for ((i, v) in spells.withIndex())
      res[i] = potions.size - binarySearch(success, v, potions)
    return res
  }

  fun binarySearch(success: Long, spell: Int, potions: IntArray): Int {
    var l = 0
    var r = potions.size - 1
    while (l <= r) {
      val m = (l + r) / 2
      if (potions[m].toLong() * spell >= success)
        r = m - 1
      else
        l = m + 1
    }
    return l
  }
}