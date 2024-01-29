package programmers.basic.day21

fun main() {
    println(IntegerPartKotlin().solution(1.42))
    println(IntegerPartKotlin().solution(69.32))
}

class IntegerPartKotlin {

    fun solution(flo: Double) = flo.toInt()

}