package programmers.basic.day12

class SortStringKotlin1 {

    fun solution(my_string: String): IntArray {
        return my_string.filter { it.isDigit() }.map { it - '0' }.sorted().toIntArray()
    }

}

fun main() {
    println(SortStringKotlin1().solution("hi12392").contentToString())
    println(SortStringKotlin1().solution("p2o4i8gj2").contentToString())
    println(SortStringKotlin1().solution("abcde0").contentToString())
}