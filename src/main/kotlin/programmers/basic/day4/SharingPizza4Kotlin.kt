package programmers.basic.day4

class SharingPizza4Kotlin {

    fun solution(numbers: IntArray): Double {
        return numbers.average()
    }

}

fun main() {
    println(SharingPizza4Kotlin().solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    println(SharingPizza4Kotlin().solution(intArrayOf(89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)))
}