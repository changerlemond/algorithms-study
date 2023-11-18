package programmers.level0.day20

class AdditionPolynomialsKotlin {

    fun solution(polynomial: String): String {
        var xNum = 0
        var num = 0

        for (s in polynomial.split(" ".toRegex())) {
            if (s.contains("x")) {
                xNum += if (s == "x") 1 else s.replace("x".toRegex(), "").toInt()
            } else if (s != "+") {
                num += s.toInt()
            }
        }

        return ((if (xNum != 0) (if ((xNum > 1)) xNum.toString() + "x" else "x") else "")
                + (if (num != 0) (if (xNum != 0) " + " else "")
                + num else (if (xNum == 0) "0" else "")))
    }

}

fun main() {
    println(AdditionPolynomialsKotlin().solution("3x + 7 + x"))
    println(AdditionPolynomialsKotlin().solution("x + x + x"))
}