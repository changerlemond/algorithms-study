package programmers.basic.day24

fun main() {
    println(MakeLKotlin().solution("abcdevwxyz"))
    println(MakeLKotlin().solution("jjnnllkkmm"))
}

class MakeLKotlin {

    fun solution(myString: String): String {
        return myString.map { if (it.code <= 'l'.code) 'l' else it }.joinToString("")
    }

}