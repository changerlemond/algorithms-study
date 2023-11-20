package programmers.introductory.day22

class CheckingForFinitePrimeKotlin {

    fun solution(a: Int, b: Int): Int {
        var newB = b / gcd(a, b)

        while (newB != 1) {
            newB /= if (newB % 2 == 0) {
                2
            } else if (newB % 5 == 0) {
                5
            } else {
                return 2
            }
        }

        return 1
    }

    private tailrec fun gcd(a: Int, b: Int): Int = if (b == 0 ) a else gcd(b, a % b)

}

fun main() {
    println(CheckingForFinitePrimeKotlin().solution(7, 20))
    println(CheckingForFinitePrimeKotlin().solution(11, 22))
    println(CheckingForFinitePrimeKotlin().solution(12, 21))
}