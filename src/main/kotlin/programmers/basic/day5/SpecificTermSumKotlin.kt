package programmers.basic.day5

fun main() {
    println(SpecificTermSumKotlin().solution(3, 4, arrayOf(true, false, false, true, true)))
    println(SpecificTermSumKotlin().solution(7, 1, arrayOf(false, false, false, true, false, false, false)))
}

class SpecificTermSumKotlin {

    fun solution(a: Int, d: Int, included: Array<Boolean>) = included.indices.filter { included[it] }.sumOf { a + d * it }

}