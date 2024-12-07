class Solution {
    var count = 0
    fun goodNodes(root: TreeNode?): Int {
        find(root!!, root.`val`)
        return count
    }

    private fun find(root: TreeNode, max: Int) {
        if (root.`val` >= max) count ++
        root.left?.let { find(it, maxOf(it.`val`, max))}
        root.right?.let { find(it, maxOf(it.`val`, max))}
    }
}