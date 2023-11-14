package programmers.level0.day15

class HateEnglishKotlin {

    fun solution(numbers: String): Long {
        val array = numbers
            .replace("zero", "0")
            .replace("one", "1")
            .replace("two", "2")
            .replace("three", "3")
            .replace("four", "4")
            .replace("five", "5")
            .replace("six", "6")
            .replace("seven", "7")
            .replace("eight", "8")
            .replace("nine", "9")
        return array.toLong()
    }

}

fun main() {
    println(HateEnglishKotlin().solution("onetwothreefourfivesixseveneightnine"))
    println(HateEnglishKotlin().solution("onefourzerosixseven"))
}