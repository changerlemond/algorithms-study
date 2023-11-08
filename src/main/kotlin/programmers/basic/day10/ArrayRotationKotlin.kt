package programmers.basic.day10

class ArrayRotationKotlin {

    fun solution(numbers: IntArray, direction: String): IntArray {
        val copyArray = numbers.toMutableList()
        if (direction == "right") {
            copyArray.add(0, copyArray.last())
            copyArray.removeAt(copyArray.lastIndex)
        } else {
            copyArray.add(copyArray.first())
            copyArray.removeAt(0)
        }
        return copyArray.toIntArray()
    }

}

fun main() {
    println(ArrayRotationKotlin().solution(intArrayOf(1, 2, 3), "right").contentToString())
    println(ArrayRotationKotlin().solution(intArrayOf(4, 455, 6, 4, -1, 45, 6), "left").contentToString())
}