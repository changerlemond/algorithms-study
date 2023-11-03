package programmers.basic.day5

class IceAmericanoKotlin {

    fun solution(money: Int): IntArray {
        return intArrayOf(money / 5500, money % 5500)
    }

}

fun main() {
    println(IceAmericanoKotlin().solution(5500).contentToString())
    println(IceAmericanoKotlin().solution(15000).contentToString())
}