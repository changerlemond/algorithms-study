package programmers.level1

fun main() {
    println(GcdLcmKotlin().solution(3, 12).contentToString())
    println(GcdLcmKotlin().solution(2, 5).contentToString())
}

class GcdLcmKotlin {

    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)
        val lcm = n * m / gcd
        return intArrayOf(gcd, lcm)
    }

    tailrec fun gcd(n: Int, m: Int): Int = if (m == 0) n else gcd(m, n % m)

}