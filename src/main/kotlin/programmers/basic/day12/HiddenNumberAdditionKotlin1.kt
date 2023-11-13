package programmers.basic.day12

class HiddenNumberAdditionKotlin1 {

    fun solution(my_string: String) = my_string.filter(Char::isDigit).map { char -> char.toString().toInt() }.sum()

}

fun main() {
    println(HiddenNumberAdditionKotlin1().solution("aAb1B2cC34oOp"))
    println(HiddenNumberAdditionKotlin1().solution("1a2b3c4d123"))
}