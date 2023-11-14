package programmers.level0.day14

class DecryptionKotlin {

    fun solution(cipher: String, code: Int): String = cipher.filterIndexed { i, _ -> (i + 1) % code == 0 }

}

fun main() {
    println(DecryptionKotlin().solution("dfjardstddetckdaccccdegk", 4))
    println(DecryptionKotlin().solution("pfqallllabwaoclk", 2))
}