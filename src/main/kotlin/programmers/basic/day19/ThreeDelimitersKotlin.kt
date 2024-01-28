package programmers.basic.day19

fun main() {
    println(ThreeDelimitersKotlin().solution("baconlettucetomato").contentToString())
    println(ThreeDelimitersKotlin().solution("abcd").contentToString())
    println(ThreeDelimitersKotlin().solution("cabab").contentToString())
}

class ThreeDelimitersKotlin {

    fun solution(myStr: String): Array<String> {
        val result = myStr.split("[abc]".toRegex()).filter { it.isNotEmpty() }.toTypedArray()
        return if (result.isEmpty()) arrayOf("EMPTY") else result
    }

}