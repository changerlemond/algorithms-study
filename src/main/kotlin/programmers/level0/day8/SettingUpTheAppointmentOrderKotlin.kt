package programmers.level0.day8

class SettingUpTheAppointmentOrderKotlin {

    fun solution(emergency: IntArray): IntArray {
        val intArray = IntArray(emergency.size)
        for (i in emergency.indices) {
            var rank = 1
            for (k in emergency) {
                if (k > emergency[i]) {
                    rank++
                }
            }
            intArray[i] = rank
        }
        return intArray
    }

}

fun main() {
    println(SettingUpTheAppointmentOrderKotlin().solution(intArrayOf(3, 76, 24)).contentToString())
    println(SettingUpTheAppointmentOrderKotlin().solution(intArrayOf(1, 2, 3, 4, 5, 6, 7)).contentToString())
    println(SettingUpTheAppointmentOrderKotlin().solution(intArrayOf(30, 10, 23, 6, 100)).contentToString())
}