package programmers.basic.day16

fun main() {
    println(ArrayStringCaseConversionKotlin().solution(arrayOf("AAA", "BBB", "CCC", "DDD")).contentToString())
    println(ArrayStringCaseConversionKotlin().solution(arrayOf("aBc", "AbC")).contentToString())
}

class ArrayStringCaseConversionKotlin {

    fun solution(strArr: Array<String>): Array<String> {
        strArr.forEachIndexed { index, s ->
            strArr[index] = if (index % 2 == 0) s.lowercase() else s.uppercase()
        }
        return strArr
    }

}