package programmers.introductory.day20

class CharacterCoordinatesKotlin {

    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val minX = board[0] / 2
        val minY = board[1] / 2

        val answer = intArrayOf(0, 0)

        keyinput.forEach {
            when (it) {
                "left" -> if (minX.unaryMinus() < answer[0]) answer[0]--
                "right" -> if (minX.unaryPlus() > answer[0]) answer[0]++
                "up" -> if (minY.unaryPlus() > answer[1]) answer[1]++
                "down" -> if (minY.unaryMinus() < answer[1]) answer[1]--
            }
        }

        return answer
    }

}

fun main() {
    println(CharacterCoordinatesKotlin().solution(arrayOf("left", "right", "up", "right", "right"), intArrayOf(11, 11)).contentToString())
    println(CharacterCoordinatesKotlin().solution(arrayOf("down", "down", "down", "down", "down"), intArrayOf(7, 9)).contentToString())
}