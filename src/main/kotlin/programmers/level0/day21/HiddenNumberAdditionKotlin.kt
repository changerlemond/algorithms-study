package programmers.level0.day21

class HiddenNumberAdditionKotlin {

    fun solution(my_string: String): Int {
        return my_string.split("[A-Z|a-z]".toRegex()).filter(String::isNotEmpty).sumOf { it.toInt() }
    }

}

fun main() {
    println(HiddenNumberAdditionKotlin().solution("aAb1B2cC34oOp"))
    println(HiddenNumberAdditionKotlin().solution("1a2b3c4d123Z"))
}