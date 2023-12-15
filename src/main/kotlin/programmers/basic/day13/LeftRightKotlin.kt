package programmers.basic.day13

fun main() {
    println(LeftRightKotlin().solution(arrayOf("u", "u", "l", "r")).contentToString())
    println(LeftRightKotlin().solution(arrayOf("l")).contentToString())
}

class LeftRightKotlin {

    fun solution(str_list: Array<String>): Array<String> {
        str_list.forEachIndexed { i, v ->
            if(v == "l") return str_list.slice(0 until i).toTypedArray()
            else if(v == "r") return str_list.slice(i + 1 until str_list.size).toTypedArray()
        }
        return arrayOf<String>()
    }

}