package programmers.introductory.day19

class TallerPersonKotlin {

    fun solution(array: IntArray, height: Int): Int {
        return array.count { number -> number > height }
    }

}

fun main() {
    println(TallerPersonKotlin().solution(intArrayOf(149, 180, 192, 170), 167))
    println(TallerPersonKotlin().solution(intArrayOf(180, 120, 140), 190))
}