package programmers.basic.day4


fun main() {
    println(MultipleNKotlin().solution(98, 2))
    println(MultipleNKotlin().solution(34, 3))
}

class MultipleNKotlin {

    fun solution(num: Int, n: Int): Int {
        return if (num % n == 0) 1 else 0
    }

}