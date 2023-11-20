package programmers.introductory.day23

class Whimpering1Kotlin {

    fun solution(babbling: Array<String>): Int {
        val regex = "aya|ye|woo|ma".toRegex()
        return babbling.map { it.replace(regex, "") }.count { it.isEmpty() }
    }

}

fun main() {
    println(Whimpering1Kotlin().solution(arrayOf("aya", "yee", "u", "maa", "wyeoo")))
    println(Whimpering1Kotlin().solution(arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")))
}