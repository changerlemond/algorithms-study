package programmers.basic.day11

fun main() {
    println(CountCharacterNumberKotlin().solution("Programmers").contentToString())
}

class CountCharacterNumberKotlin {

    fun solution(my_string: String): IntArray {
        val answer = IntArray(52) { 0 }

        my_string.forEach {
            if (it >= 'a') {
                answer[it - 'a' + 26]++
            } else if (it >= 'A') {
                answer[it - 'A']++
            }
        }

        return answer
    }

}