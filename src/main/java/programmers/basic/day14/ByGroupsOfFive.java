package programmers.basic.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByGroupsOfFive {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }

    public static String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                list.add(names[i]);
            }
        }
        return list.toArray(new String[0]);
    }

}
