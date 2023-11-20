package programmers.basic

fun main() {
    val input = readln().split(' ')
    val string = input[0]
    val number = input[1].toInt()
    println(string.repeat(number))
}