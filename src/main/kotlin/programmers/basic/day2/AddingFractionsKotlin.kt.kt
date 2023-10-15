package programmers.basic.day2

class AddingFractionsKotlin {

    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        // 배열 선언 (분자, 분모)
        val answer: IntArray = intArrayOf(denom1 * numer2 + denom2 * numer1, denom1 * denom2)
        // 최대 공약수 구하기
        val gcdValue = gcd(answer[0], answer[1])

        // 최대 공약수 로 나누어 기약 분수 만들기
        answer[0] /= gcdValue
        answer[1] /= gcdValue

        // 값 반환
        return answer
    }

    // 재귀 함수를 이용한 최대 공약수 구하기
    fun gcd(a: Int, b:Int): Int = if (b != 0) gcd(b, a % b) else a

}

fun main() {
    println(AddingFractionsKotlin().solution(1, 2, 3, 4).contentToString())
}