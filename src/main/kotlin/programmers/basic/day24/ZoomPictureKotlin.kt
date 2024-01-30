package programmers.basic.day24

fun main() {
    println(ZoomPictureKotlin().solution(
        arrayOf(".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."), 2)
        .contentToString()
    )
    println(ZoomPictureKotlin().solution(arrayOf("x.x", ".x.", "x.x"), 3).contentToString())
}

class ZoomPictureKotlin {

    fun solution(picture: Array<String>, k: Int): Array<String> {
        val answer = mutableListOf<String>()
        picture.forEach { line ->
            var result = ""
            line.forEach { char -> repeat(k) { result += char } }
            repeat(k) { answer.add(result) }
        }
        return answer.toTypedArray()
    }

}