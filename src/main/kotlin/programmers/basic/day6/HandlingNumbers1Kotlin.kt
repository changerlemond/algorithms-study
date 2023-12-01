package programmers.basic.day6

fun main() {
    println(HandlingNumbers1Kotlin().solution(0, "wsdawsdassw"))
}

class HandlingNumbers1Kotlin {

    fun solution(n: Int, control: String): Int {
        var result = n
        control.forEach {
            when (it) {
                'w' -> result++
                's' -> result--
                'd' -> result += 10
                'a' -> result -= 10
            }
        }
        return result
    }

}