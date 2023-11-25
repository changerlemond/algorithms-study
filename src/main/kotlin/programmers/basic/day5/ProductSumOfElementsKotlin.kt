package programmers.basic.day5

import java.util.*
import kotlin.math.pow

fun main() {
    println(ProductSumOfElementsKotlin().solution(intArrayOf(3, 4, 5, 2, 1)))
    println(ProductSumOfElementsKotlin().solution(intArrayOf(5, 7, 8, 3)))
}

class ProductSumOfElementsKotlin {

    fun solution(num_list: IntArray) =
        if (Arrays.stream(num_list).reduce(1) { a: Int, b: Int -> a * b } < Arrays.stream(num_list).sum().toDouble()
                .pow(2.0)) 1 else 0

}