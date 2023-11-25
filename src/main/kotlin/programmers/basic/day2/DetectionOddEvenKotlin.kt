package programmers.basic.day2

fun main() {
    val a = readln().toInt()
    println("$a is ${if (a % 2 == 0) "even" else "odd"}")
}