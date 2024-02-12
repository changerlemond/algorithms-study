package programmers.level1

fun main() {
    println(
        MatrixAdditionKotlin().solution(
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
            arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
        ).contentDeepToString()
    )
    println(
        MatrixAdditionKotlin().solution(
            arrayOf(intArrayOf(1), intArrayOf(2)),
            arrayOf(intArrayOf(3), intArrayOf(4))
        ).contentDeepToString()
    )
}

class MatrixAdditionKotlin {

    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { row ->
            IntArray(arr1[0].size) { col ->
                arr1[row][col] + arr2[row][col]
            }
        }
    }

}