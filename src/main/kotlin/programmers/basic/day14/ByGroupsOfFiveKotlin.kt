package programmers.basic.day14

fun main() {
    println(ByGroupsOfFiveKotlin().solution(arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")).contentToString())
}

class ByGroupsOfFiveKotlin {

    fun solution(names: Array<String>): Array<String> {
        return names.toList().chunked(5) { it[0] }.toTypedArray()
    }

}