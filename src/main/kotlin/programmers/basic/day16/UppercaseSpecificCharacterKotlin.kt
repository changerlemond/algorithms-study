package programmers.basic.day16

fun main() {
    println(UppercaseSpecificCharacterKotlin().solution("programmers", "p"))
    println(UppercaseSpecificCharacterKotlin().solution("lowercase", "x"))
}

class UppercaseSpecificCharacterKotlin {

    fun solution(my_string: String, alp: String) = my_string.replace(alp, alp.uppercase())

}