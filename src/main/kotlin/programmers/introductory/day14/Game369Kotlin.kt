package programmers.introductory.day14

class Game369Kotlin {

    fun solution(order: Int): Int {
        return order.toString().map { it.digitToInt() }.count { it != 0 && it % 3 == 0 }
    }

}

fun main() {
    println(Game369Kotlin().solution(3))
    println(Game369Kotlin().solution(29423))
}