package programmers.level1

fun main() {
    println(FindingMrKimInSeoulKotlin().solution(arrayOf("Jane", "Kim")))
}

class FindingMrKimInSeoulKotlin {

    fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"

}