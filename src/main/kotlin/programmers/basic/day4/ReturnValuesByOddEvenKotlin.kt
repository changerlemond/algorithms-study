package programmers.basic.day4


fun main() {
    println(ReturnValuesByOddEvenKotlin().solution(7))
    println(ReturnValuesByOddEvenKotlin().solution(10))
}

class ReturnValuesByOddEvenKotlin {

    fun solution(n: Int): Int {
        return if (n % 2 != 0) {
            (n downTo 1 step 2).sum()
        } else {
            (n downTo 1 step 2).sumOf { it * it }
        }
    }

}