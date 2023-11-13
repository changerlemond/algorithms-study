package programmers.level0.day5

class PrintAgeKotlin {

    fun solution(age: Int): Int {
        return 2022 - age + 1
    }

}

fun main() {
    println(PrintAgeKotlin().solution(40))
    println(PrintAgeKotlin().solution(23))
}