package programmers.level1

import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

fun main() {
    println(Year2016Kotlin().solution(5, 24))
}

class Year2016Kotlin {

    fun solution(a: Int, b: Int): String {
        return LocalDate.of(2016, a, b).dayOfWeek.getDisplayName(TextStyle.SHORT, Locale("ko-KR")).uppercase()
    }

}