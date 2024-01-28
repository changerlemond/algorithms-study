package programmers.basic.day20

import kotlin.math.ceil
import kotlin.math.ln
import kotlin.math.pow

fun main() {
    println(ArrayLengthToPowerOf2Kotlin().solution(intArrayOf(1, 2, 3, 4, 5, 6)).contentToString())
    println(ArrayLengthToPowerOf2Kotlin().solution(intArrayOf(58, 172, 746, 89)).contentToString())
}

class ArrayLengthToPowerOf2Kotlin {

    fun solution(arr: IntArray): IntArray {
        return arr.copyOf(2.0.pow(ceil(ln(arr.size.toDouble()) / ln(2.0))).toInt())
    }

}