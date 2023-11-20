package programmers.level0.day24

class BinaryAdditionKotlin {

    fun solution(bin1: String, bin2: String) = Integer.toBinaryString(bin1.toInt(2) + bin2.toInt(2))

}

fun main() {
    println(BinaryAdditionKotlin().solution("10", "11"))
    println(BinaryAdditionKotlin().solution("1001", "1111"))
}