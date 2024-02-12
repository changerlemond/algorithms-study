package programmers.level1

fun main() {
    println(MaskingPhoneNumberKotlin().solution("01033334444"))
    println(MaskingPhoneNumberKotlin().solution("027778888"))
}

class MaskingPhoneNumberKotlin {

    fun solution(phone_number: String): String {
        return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
    }

}