package programmers.basic.day9

class RockPaperScissorsKotlin {

    fun solution(rsp: String): String {
        val rock = '0'
        val scissors = '2'
        val paper = '5'
        val result = StringBuilder()

        for (i in rsp) {
            when (i) {
                rock -> result.append(paper)
                scissors -> result.append(rock)
                paper -> result.append(scissors)
            }
        }

        return result.toString()
    }

}

fun main() {
    println(RockPaperScissorsKotlin().solution("2"))
    println(RockPaperScissorsKotlin().solution("205"))
}