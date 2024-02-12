package programmers.level1

fun main() {
    println(CollatzConjectureKotlin().solution(6))
    println(CollatzConjectureKotlin().solution(16))
    println(CollatzConjectureKotlin().solution(626331))
}

class CollatzConjectureKotlin {

    fun solution(num: Int): Int = collatz(num.toLong(), 0)

    private tailrec fun collatz(n: Long, c: Int): Int =
        when {
            c > 500 -> -1
            n == 1L -> c
            else -> collatz(if (n % 2 == 0L) n / 2 else n * 3 + 1, c + 1)
        }

}