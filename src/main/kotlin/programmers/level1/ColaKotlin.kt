package programmers.level1

fun main() {
    println(ColaKotlin().solution(2, 1, 20))
    println(ColaKotlin().solution(3, 1, 20))
}

class ColaKotlin {

    fun solution(a: Int, b: Int, n: Int): Int {
        return (n - b) / (a - b) * b
    }

}