package programmers.level1

fun main() {
    println(DescendingIntegerArrangerKotlin().solution(118372))
}

class DescendingIntegerArrangerKotlin {

    fun solution(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()

}