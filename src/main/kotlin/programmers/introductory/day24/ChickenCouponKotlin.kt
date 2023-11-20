package programmers.introductory.day24

class ChickenCouponKotlin {

    fun solution(chicken: Int): Int = if(chicken < 10) 0 else chicken / 10 + solution(chicken / 10 + chicken % 10)

}

fun main() {
    println(ChickenCouponKotlin().solution(100))
    println(ChickenCouponKotlin().solution(1081))
}