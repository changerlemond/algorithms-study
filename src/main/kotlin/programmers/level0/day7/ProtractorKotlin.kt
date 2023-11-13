package programmers.level0.day7

class ProtractorKotlin {

    fun solution(angle: Int) = (when {
        angle == 180 -> 4
        angle > 90 -> 3
        angle == 90 -> 2
        else -> 1
    }.toInt())

}

fun main() {
    println(ProtractorKotlin().solution(70))
    println(ProtractorKotlin().solution(91))
    println(ProtractorKotlin().solution(180))
}