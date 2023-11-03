package programmers.basic.day5

class RetailClothingDiscountsKotlin {

    fun solution(price: Int) = (when {
        price >= 500_000 -> price * 0.8
        price >= 300_000 -> price * 0.9
        price >= 100_000 -> price * 0.95
        else -> price
    }.toInt())

}

fun main() {
    println(RetailClothingDiscountsKotlin().solution(150_000))
    println(RetailClothingDiscountsKotlin().solution(580_000))
}