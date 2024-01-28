package programmers.basic.day20

fun main() {
    println(ConcatenatingStringsKotlin().solution(arrayOf("a","bc","d","efg","hi")))
    println(ConcatenatingStringsKotlin().solution1(arrayOf("a","bc","d","efg","hi")))
}

class ConcatenatingStringsKotlin {

    fun solution(strArr: Array<String>) = strArr.groupBy(String::length).values.maxOf(List<String>::size)

    fun solution1(strArr: Array<String>): Int {
        return strArr.groupBy { it.length }
            .maxOf { it.value.size }
    }

}