package programmers.basic.day17

fun main() {
    println(RemoveADKotlin().solution(arrayOf("and","notad","abcd")))
    println(RemoveADKotlin().solution(arrayOf("there","are","no","a","ds")))
}

class RemoveADKotlin {

    fun solution(strArr: Array<String>) = strArr.filter { !it.contains("ad") }

}