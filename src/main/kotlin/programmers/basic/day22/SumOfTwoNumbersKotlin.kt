package programmers.basic.day22

import java.math.BigInteger

fun main() {
    println(SumOfTwoNumbersKotlin().solution("582", "734"))
    println(SumOfTwoNumbersKotlin().solution("18446744073709551615", "287346502836570928366"))
    println(SumOfTwoNumbersKotlin().solution("0", "0"))
}

class SumOfTwoNumbersKotlin {

    fun solution(a: String, b: String) = BigInteger(a).add(BigInteger(b)).toString()

}