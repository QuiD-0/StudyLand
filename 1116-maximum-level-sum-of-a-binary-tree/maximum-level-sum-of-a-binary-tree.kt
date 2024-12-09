class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        val queue = ArrayDeque<TreeNode>()
        val list = mutableListOf<Int>()

        root?.let { queue.add(it) }

        while (queue.isNotEmpty()) {
            val size = queue.size
            var sum = 0
            for (i in 0 ..< size){
                val node = queue.removeFirst()
                sum += node.`val`

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            list.add(sum)
        }
        return list.withIndex().maxBy { it.value }.index.inc()
    }
}