package programmers.level1

fun main() {
    println(DescendingOrderKotlin().solution("Zbcdefg"))
}

class DescendingOrderKotlin {

    fun solution(s: String): String {
        return s.toCharArray().sortedWith(Comparator { a, b ->  b - a }).joinToString("")
    }

}