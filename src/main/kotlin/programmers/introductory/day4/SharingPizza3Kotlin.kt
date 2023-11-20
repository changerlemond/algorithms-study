package programmers.introductory.day4

class SharingPizza3Kotlin {

    fun solution(slice: Int, n: Int): Int {
        return (n + slice - 1) / slice
    }

}

fun main() {
    println(SharingPizza3Kotlin().solution(7, 10))
    println(SharingPizza3Kotlin().solution(4, 12))
}