package programmers.basic.day22

fun main() {
    println(RemoveArrayElementKotlin().solution(intArrayOf(293, 1000, 395, 678, 94), intArrayOf(94, 777, 104, 1000, 1, 12)))
    println(RemoveArrayElementKotlin().solution(intArrayOf(110, 66, 439, 785, 1), intArrayOf(377, 823, 119, 43)))
}

class RemoveArrayElementKotlin {

    fun solution(arr: IntArray, delete_list: IntArray) = arr.toList() - delete_list.toList().toSet()

}