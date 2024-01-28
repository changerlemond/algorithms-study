package programmers.basic.day18

fun main() {
    println(SplittingSortingStringsKotlin().solution("axbxcxdx").contentToString())
    println(SplittingSortingStringsKotlin().solution("dxccxbbbxaaaa").contentToString())
}

class SplittingSortingStringsKotlin {

    fun solution(myString: String) = myString.split("x").filter(String::isNotEmpty).sorted().toTypedArray()

}