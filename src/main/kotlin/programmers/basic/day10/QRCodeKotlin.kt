package programmers.basic.day10

fun main() {
    println(QRCodeKotlin().solution(3, 1, "qjnwezgrpirldywt"))
    println(QRCodeKotlin().solution(1, 0, "programmers"))
}

class QRCodeKotlin {

    fun solution(q: Int, r: Int, code: String): String {
        return code.filterIndexed { i, _ -> i % q == r}
    }

}