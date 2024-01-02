package programmers.basic.day14

fun main() {
    println(ToDoListKotlin().solution(arrayOf("problemsolving", "practiceguitar", "swim", "studygraph"), booleanArrayOf(true, false, true, false)).contentToString())
}

class ToDoListKotlin {

    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        return todo_list.filterIndexed { index, _ -> finished[index].not() }.toTypedArray()
    }

}