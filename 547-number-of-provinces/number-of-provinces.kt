class Solution {
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        var provinces = 0
        for (i in 0 until isConnected.size) {
            if (isConnected[i][i] == -1) { // if city visited
                continue
            }
            exploreProvinces(isConnected, i)
            provinces++
        }
        return provinces
    }
    
    fun exploreProvinces(isConnected: Array<IntArray>, i: Int) {
        isConnected[i][i] = -1 // mark the city as visited
        for (j in 0 until isConnected.size) {
            if (j == i) {
                continue
            }
            if (isConnected[j][j] != -1 && isConnected[i][j] == 1) {
                exploreProvinces(isConnected, j)
            }
        }
    }
}