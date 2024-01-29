package programmers.basic.day22

fun main() {
    println(CheckItSubStringKotlin().solution("banana", "ana"))
    println(CheckItSubStringKotlin().solution("banana", "wxyz"))
}

class CheckItSubStringKotlin {

    fun solution(my_string: String, target: String): Int {
        return if (my_string.contains(target)) 1 else 0
    }

}