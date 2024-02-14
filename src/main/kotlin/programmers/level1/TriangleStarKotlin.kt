package programmers.level1

fun main() {
    val (n, m) = readln().split(' ').map(String::toInt)
    for (i in 1..m) {
        println("*".repeat(n))
    }
}