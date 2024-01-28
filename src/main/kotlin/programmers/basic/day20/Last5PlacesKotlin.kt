package programmers.basic.day20

fun main() {
    println(Last5PlacesKotlin().solution(intArrayOf(12, 4, 15, 46, 38, 1, 14)).contentToString())
    println(Last5PlacesKotlin().solution1(intArrayOf(12, 4, 15, 46, 38, 1, 14)).contentToString())
}
class Last5PlacesKotlin {

    fun solution(num_list: IntArray): IntArray {
        return num_list.sorted().slice(0..4).toIntArray()
    }

    fun solution1(num_list: IntArray): IntArray {
        return num_list.sorted().take(5).toIntArray()
    }

}