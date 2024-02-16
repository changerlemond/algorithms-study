package programmers.level1

fun main() {
    println(CardDeckKotlin().solution(arrayOf("i", "drink", "water"), arrayOf("want", "to"), arrayOf("i", "want", "to", "drink", "water")))
    println(CardDeckKotlin().solution(arrayOf("i", "water", "drink"), arrayOf("want", "to"), arrayOf("i", "want", "to", "drink", "water")))
}

class CardDeckKotlin {

    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var idx1 = 0
        var idx2 = 0

        goal.forEach {
            if (idx1 < cards1.size && it == cards1[idx1]) idx1++
            else if (idx2 < cards2.size && it == cards2[idx2]) idx2++
            else return "No"
        }

        return "Yes"
    }

}