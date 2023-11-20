package programmers.introductory.day9

class ArmyOfAntsKotlin {

    fun solution(hp: Int): Int {
        var copyHp = hp
        var count = 0

        count += copyHp / 5
        copyHp %= 5

        count += copyHp / 3
        copyHp %= 3

        count += copyHp

        return count
    }

}

fun main() {
    println(ArmyOfAntsKotlin().solution(23))
    println(ArmyOfAntsKotlin().solution(24))
    println(ArmyOfAntsKotlin().solution(999))
}
