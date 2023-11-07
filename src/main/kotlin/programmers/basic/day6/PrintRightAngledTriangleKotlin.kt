package programmers.basic.day6

fun main(args: Array<String>) {
    val (n) = readln().split(' ').map(String::toInt)

    for (i in 1..n) {
        println("*".repeat(i))
    }
}