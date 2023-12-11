package programmers.basic.day11

fun main() {
    println(RemoveCharacterKotlin().solution("apporoograpemmemprs", intArrayOf(1, 16, 6, 15, 0, 10, 11, 3)))
}

class RemoveCharacterKotlin {

    fun solution(my_string: String, indices: IntArray): String {
        return my_string.filterIndexed { index, w -> index !in indices }
    }

}