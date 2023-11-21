package programmers.basic.day2

fun main() {
    val (a, b) = readln().split(' ').map(String::toInt)
    println("$a + $b = ${a + b}")
}