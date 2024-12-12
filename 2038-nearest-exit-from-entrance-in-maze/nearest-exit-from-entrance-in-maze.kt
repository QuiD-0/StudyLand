class Solution {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val m = maze.size
        val n = maze[0].size

        val directions = arrayOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)
        val visited = Array(m) { BooleanArray(n) }
        val queue: Queue<State> = LinkedList()

        queue.add(State(entrance[0], entrance[1], 0))
        visited[entrance[0]][entrance[1]] = true

        while (queue.isNotEmpty()) {
            val state = queue.poll()
            val row = state.row
            val col = state.col
            val step = state.step

            if ((row == 0 || col == 0 || row == m - 1 || col == n - 1)
                && !(row == entrance[0] && col == entrance[1])
                && (maze[row][col] == '.')
            ) {
                return step
            }

            for ((dx, dy) in directions) {
                val newX = row + dx
                val newY = col + dy

                if (newX in 0 until m
                    && newY in 0 until n
                    && !visited[newX][newY]
                    && maze[newX][newY] == '.'
                ) {
                    queue.add(State(newX, newY, step + 1))
                    visited[newX][newY] = true
                }
            }
        }
        return -1
    }
}

data class State(val row: Int, val col: Int, val step: Int)