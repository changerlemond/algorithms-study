package programmers.basic.day1

fun main() {
    val string = readln()
    string.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }
        .joinToString("")
        .also { println(it) }
}