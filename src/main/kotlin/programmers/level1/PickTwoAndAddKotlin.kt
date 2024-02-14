package programmers.level1

fun main() {
    println(PickTwoAndAddKotlin().solution(intArrayOf(2, 1, 3, 4, 1)).contentToString())
    println(PickTwoAndAddKotlin().solution(intArrayOf(5, 0, 2, 7)).contentToString())
}

class PickTwoAndAddKotlin {

    fun solution(numbers: IntArray): IntArray {
        val result = mutableSetOf<Int>()

        for ((index, value) in numbers.withIndex()) {
            for (i in index + 1 until numbers.size) {
                result.add(value + numbers[i])
            }
        }

        return result.sorted().toIntArray()
    }

}