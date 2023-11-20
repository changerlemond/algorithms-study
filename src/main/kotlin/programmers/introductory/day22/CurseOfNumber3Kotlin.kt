package programmers.introductory.day22

class CurseOfNumber3Kotlin {

    fun solution(n: Int): Int {
        var result = 0
        for (i in 0 until n) {
            result++
            while (result % 3 == 0 || result.toString().contains("3")) {
                result++
            }
        }
        return result
    }

}

fun main() {
    println(CurseOfNumber3Kotlin().solution(15))
    println(CurseOfNumber3Kotlin().solution(40))
}