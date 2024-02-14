package programmers.level1

fun main() {
    println(NumberStringEnglishWordKotlin().solution("one4seveneight"))
    println(NumberStringEnglishWordKotlin().solution("23four5six7"))
    println(NumberStringEnglishWordKotlin().solution("2three45sixseven"))
    println(NumberStringEnglishWordKotlin().solution("123"))
}

class NumberStringEnglishWordKotlin {

    fun solution(s: String): Int {
        var word = s

        word = word.replace("zero", "0")
        word = word.replace("one", "1")
        word = word.replace("two", "2")
        word = word.replace("three", "3")
        word = word.replace("four", "4")
        word = word.replace("five", "5")
        word = word.replace("six", "6")
        word = word.replace("seven", "7")
        word = word.replace("eight", "8")
        word = word.replace("nine", "9")

        return word.toInt()
    }

}