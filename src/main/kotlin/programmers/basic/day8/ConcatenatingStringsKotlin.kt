package programmers.basic.day8

fun main() {
    println(ConcatenatingStringsKotlin().solution("cvsgiorszzzmrpaqpe", intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)))
    println(ConcatenatingStringsKotlin().solution("zpiaz", intArrayOf(1, 2, 0, 0, 3)))
}

class ConcatenatingStringsKotlin {

    fun solution(my_string: String, index_list: IntArray): String {
        return index_list.joinToString("") { my_string[it].toString() }
    }

}