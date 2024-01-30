package programmers.basic.day24

fun main() {
    println(CoffeeTaskKotlin().solution(arrayOf("cafelatte", "americanoice", "hotcafelatte", "anything")))
    println(CoffeeTaskKotlin().solution(arrayOf("americanoice", "americano", "iceamericano")))
}

class CoffeeTaskKotlin {

    fun solution(order: Array<String>) = order.map { if (it.contains("cafelatte")) 5000 else 4500 }.sum()

}