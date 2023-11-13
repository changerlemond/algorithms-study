package programmers.level0.day8

class TheAgeOfAnExoplanetKotlin {

    fun solution(age: Int): String {
        val alphabet = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j')

        val numberString = age.toString()
        val result = StringBuilder()

        for (digit in numberString.toCharArray()) {
            val index = digit.code - '0'.code
            result.append(alphabet[index])
        }

        return result.toString()
    }

}

fun main() {
    println(TheAgeOfAnExoplanetKotlin().solution(23))
    println(TheAgeOfAnExoplanetKotlin().solution(51))
    println(TheAgeOfAnExoplanetKotlin().solution(100))
}