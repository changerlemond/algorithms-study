package programmers.level1

fun main() {
    println(NumbersWithXIntervalKotlin().solution(2, 5).contentToString())
    println(NumbersWithXIntervalKotlin().solution(4, 3).contentToString())
    println(NumbersWithXIntervalKotlin().solution(-4, 2).contentToString())
}

class NumbersWithXIntervalKotlin {

    fun solution(x: Int, n: Int): LongArray = LongArray(n) { i -> x.toLong() * (i + 1) }

}