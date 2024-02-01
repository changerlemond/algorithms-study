package programmers.level1

fun main() {
    println(FindRemainderOneKotlin().solution(10))
    println(FindRemainderOneKotlin().solution(12))
}

class FindRemainderOneKotlin {

    fun solution(n: Int) = (1..n).first { n % it == 1 }
}