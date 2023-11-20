package programmers.level0.day23

class LoginSuccessKotlin {

    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        val user = db.find { it[0] == id_pw[0] } ?: return "fail"
        if (user[1] == id_pw[1])
            return "login"
        return "wrong pw"
    }

}

fun main() {
    println(LoginSuccessKotlin().solution(arrayOf("meosseugi", "1234"), arrayOf(arrayOf("rardss", "123"), arrayOf("yyoom", "1234"), arrayOf("meosseugi", "1234"))))
    println(LoginSuccessKotlin().solution(arrayOf("programmer01", "15789"), arrayOf(arrayOf("programmer02", "111111"), arrayOf("programmer00", "134"), arrayOf("programmer01", "1145"))))
    println(LoginSuccessKotlin().solution(arrayOf("rabbit04", "98761"), arrayOf(arrayOf("jaja11", "98761"), arrayOf("krong0313", "29440"), arrayOf("rabbit00", "111333"))))
}