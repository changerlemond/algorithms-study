package programmers.level1

fun main() {
    println(ReverseTernaryKotlin().solution(45))
    println(ReverseTernaryKotlin().solution(125))
}

class ReverseTernaryKotlin {

    fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)

}