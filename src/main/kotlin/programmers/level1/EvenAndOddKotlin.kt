package programmers.level1

fun main() {
    println(EvenAndOddKotlin().solution(3))
    println(EvenAndOddKotlin().solution(4))
}

class EvenAndOddKotlin {

    fun solution(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }

}