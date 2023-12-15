package programmers.basic.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsIntervalsN {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 2)));
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 4)));
    }

    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n){
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

}
