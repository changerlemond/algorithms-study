package programmers.basic.day4

class SharingPizza1Kotlin {

    fun solution(n: Int): Int {
        return (n + 6) / 7
    }

}

fun main() {
    println(SharingPizza1Kotlin().solution(7))
    println(SharingPizza1Kotlin().solution(1))
    println(SharingPizza1Kotlin().solution(15))
}