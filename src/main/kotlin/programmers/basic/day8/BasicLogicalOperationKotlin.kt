package programmers.basic.day8

fun main() {
    println(BasicLogicalOperationKotlin().solution(x1 = false, x2 = true, x3 = true, x4 = true))
    println(BasicLogicalOperationKotlin().solution(x1 = true, x2 = false, x3 = false, x4 = false))
}

class BasicLogicalOperationKotlin {

    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean = (x1 || x2) && (x3 || x4)

}