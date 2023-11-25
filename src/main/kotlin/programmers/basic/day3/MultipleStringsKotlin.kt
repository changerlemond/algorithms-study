package programmers.basic.day3


fun main() {
    println(MultipleStringsKotlin().solution("string", 3))
    println(MultipleStringsKotlin().solution("love", 10))
}
class MultipleStringsKotlin {

    fun solution(my_string: String, k: Int): String = my_string.repeat(k)

}