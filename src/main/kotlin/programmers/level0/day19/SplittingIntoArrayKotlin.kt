package programmers.level0.day19

class SplittingIntoArrayKotlin {

    fun solution(my_str: String, n: Int): Array<String> {
        val list = my_str.chunked(n)
        return Array(list.size){ list[it] }
    }

}

fun main() {
    println(SplittingIntoArrayKotlin().solution("abc1Addfggg4556b", 6).contentToString())
    println(SplittingIntoArrayKotlin().solution("abcdef123", 3).contentToString())
}