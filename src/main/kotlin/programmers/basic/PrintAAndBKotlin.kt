package programmers.basic

fun main() {
    val (a, b) = readln().split(' ').map(String::toInt)

    println("a = $a")
    println("b = $b")
}