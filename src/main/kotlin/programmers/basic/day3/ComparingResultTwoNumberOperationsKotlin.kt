package programmers.basic.day3


fun main() {
    println(ComparingResultTwoNumberOperationsKotlin().solution(2, 91))
    println(ComparingResultTwoNumberOperationsKotlin().solution(91, 2))
}

class ComparingResultTwoNumberOperationsKotlin {

    fun solution(a: Int, b: Int) = Math.max("$a$b".toInt(), 2 * a * b)

}