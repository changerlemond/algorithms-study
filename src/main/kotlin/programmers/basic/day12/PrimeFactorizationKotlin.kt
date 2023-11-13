package programmers.basic.day12

class PrimeFactorizationKotlin {

    fun solution(n: Int): IntArray {
        val factorList = mutableListOf<Int>()

        var number = n
        var i = 2
        while (i <= number) {
            while (number % i == 0) {
                factorList.add(i)
                number /= i
            }
            i++
        }

        return factorList.toSet().toIntArray()
    }

}

fun main() {
    println(PrimeFactorizationKotlin().solution(12).contentToString())
    println(PrimeFactorizationKotlin().solution(17).contentToString())
    println(PrimeFactorizationKotlin().solution(420).contentToString())
}