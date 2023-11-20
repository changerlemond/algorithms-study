package programmers.introductory.day21

class AlienLanguageDictionaryKotlin {

    fun solution(spell: Array<String>, dic: Array<String>): Int
     = if (dic.map { it.toList().sorted().joinToString("") }.contains(spell.sortedArray().joinToString(""))) 1 else 2

}

fun main() {
    println(AlienLanguageDictionaryKotlin().solution(arrayOf("p", "o", "s"), arrayOf("sod", "eocd", "qixm", "adio", "soo")))
    println(AlienLanguageDictionaryKotlin().solution(arrayOf("z", "d", "x"), arrayOf("def", "dww", "dzx", "loveaw")))
    println(AlienLanguageDictionaryKotlin().solution(arrayOf("s", "o", "m", "d"), arrayOf("moos", "dzx", "smm", "sunmmo", "som")))
}