package programmers.introductory.day6

fun main() {
    val (n) = readln().split(' ').map(String::toInt)

    for (i in 1..n) {
        println("*".repeat(i))
    }
}