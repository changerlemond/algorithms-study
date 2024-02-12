package programmers.level1

fun main() {
    println(CalculateInsufficientAmountKotlin().solution(3, 20, 4))
}

class CalculateInsufficientAmountKotlin {

    fun solution(price: Int, money: Int, count: Int): Long = (1..count).sumOf { it * price.toLong() }.let {
        if (money > it) 0 else it - money
    }

}