package programmers.introductory.day21

class SafeZoneKotlin {

    fun solution(board: Array<IntArray>): Int {
        val boomBoard = Array(board.size) { IntArray(board[0].size) }
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == 1) checkExplosion(i, j, boomBoard)
            }
        }

        var count = 0
        for (array in boomBoard) {
            for (value in array) {
                if (value == 0) count++
            }
        }

        return count
    }

    private fun checkExplosion(x: Int, y: Int, boomBoard: Array<IntArray>) {
        var explosionX: Int
        var explosionY: Int

        val aroundX = intArrayOf(0, -1, -1, -1, 0, 0, 1, 1, 1)
        val aroundY = intArrayOf(0, -1, 0, 1, -1, 1, -1, 0, 1)

        for (i in 0..8) {
            explosionX = x + aroundX[i]
            explosionY = y + aroundY[i]
            if (explosionX < boomBoard.size && explosionY < boomBoard.size) {
                if (explosionX >= 0 && explosionY >= 0) {
                    boomBoard[explosionX][explosionY] = 1
                }
            }
        }
    }

}

fun main() {
    println(SafeZoneKotlin().solution(arrayOf(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 0, 0), intArrayOf(0, 0, 0, 0, 0))))
    println(SafeZoneKotlin().solution(arrayOf(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 1, 0), intArrayOf(0, 0, 0, 0, 0))))
    println(SafeZoneKotlin().solution(arrayOf(intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1))))
}