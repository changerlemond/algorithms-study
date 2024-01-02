package programmers.basic.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoList {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }

}
