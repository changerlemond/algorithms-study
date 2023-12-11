package programmers.basic.day11

fun main() {
    println(CreateArray1Kotlin().solution(10, 3))
    println(CreateArray1Kotlin().solution(15,  5))
}

class CreateArray1Kotlin {

    fun solution(n: Int, k: Int) = (k..n step k).toList()

}