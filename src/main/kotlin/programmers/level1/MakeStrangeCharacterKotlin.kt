package programmers.level1

fun main() {
    println(MakeStrangeCharacterKotlin().solution("try hello world"))
}

class MakeStrangeCharacterKotlin {

    fun solution(s: String): String = s.split(" ").joinToString(" ") { word ->
        word.mapIndexed { index, c ->
            if (index % 2 == 0) c.uppercase() else c.lowercase()
        }.joinToString("")
    }

}