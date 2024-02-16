package programmers.level1

fun main() {
    println(MemoryScoreKotlin().solution(
        arrayOf("may", "kein", "kain", "radi"),
        intArrayOf(5, 10, 1, 3),
        arrayOf(
            arrayOf("may", "kein", "kain", "radi"),
            arrayOf("may", "kein", "brin", "deny"),
            arrayOf("kon", "kain", "may", "coni")
        )
    ).contentToString())
    println(MemoryScoreKotlin().solution(
        arrayOf("kali", "mari", "don"),
        intArrayOf(11, 1, 5),
        arrayOf(
            arrayOf("kali", "mari", "don"),
            arrayOf("pony", "tom", "teddy"),
            arrayOf("con", "mona", "don")
        )
    ).contentToString())
    println(MemoryScoreKotlin().solution(
        arrayOf("may", "kein", "kain", "radi"),
        intArrayOf(5, 10, 1, 3),
        arrayOf(
            arrayOf("may"),
            arrayOf("kein", "deny", "may"),
            arrayOf("kon", "coni")
        )
    ).contentToString())
}

class MemoryScoreKotlin {

    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val map = name.zip(yearning.toTypedArray()).toMap()
        return photo.map { p -> p.sumOf { map[it] ?: 0 } }.toIntArray()
    }

}