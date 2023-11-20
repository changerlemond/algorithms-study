package programmers.introductory.day4

class SharingPizza2Kotlin {

    fun solution(n: Int): Int {
        var answer = 0
        var remainder = n

        while (remainder != 0) {
            remainder += 6
            remainder %= n
            answer++
        }
        return answer
    }

}

fun main() {
    println(SharingPizza2Kotlin().solution(6))
    println(SharingPizza2Kotlin().solution(10))
    println(SharingPizza2Kotlin().solution(4))
}