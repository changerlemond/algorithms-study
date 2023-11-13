package programmers.level0.day9

class MorseCode1Kotlin {

    fun solution(letter: String): String {
        val morse = hashMapOf(
            ".-" to 'a',
            "-..." to 'b',
            "-.-." to 'c',
            "-.." to 'd',
            "." to 'e',
            "..-." to 'f',
            "--." to 'g',
            "...." to 'h',
            ".." to 'i',
            ".---" to 'j',
            "-.-" to 'k',
            ".-.." to 'l',
            "--" to 'm',
            "-." to 'n',
            "---" to 'o',
            ".--." to 'p',
            "--.-" to 'q',
            ".-." to 'r',
            "..." to 's',
            "-" to 't',
            "..-" to 'u',
            "...-" to 'v',
            ".--" to 'w',
            "-..-" to 'x',
            "-.--" to 'y',
            "--.." to 'z'
        )

        val words = letter.trim().split(" ")
        var result = ""

        for (i in words) {
            result += morse[i]
        }

        return result
    }

}

fun main() {
    println(MorseCode1Kotlin().solution(".... . .-.. .-.. ---"))
    println(MorseCode1Kotlin().solution(".--. -.-- - .... --- -."))
}