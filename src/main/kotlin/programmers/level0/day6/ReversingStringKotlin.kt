package programmers.level0.day6

class ReversingStringKotlin {

    fun solution(my_string: String): String {
        return my_string.reversed()
    }

}

fun main() {
    println(ReversingStringKotlin().solution("jaron"))
    println(ReversingStringKotlin().solution("bread"))
}