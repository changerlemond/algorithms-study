package programmers.basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray6 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 0})));
    }

    public static int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int i : arr) {
            if (stk.isEmpty()) {
                stk.add(i);
            } else {
                if (stk.get(stk.size() - 1) == i) {
                    stk.remove(stk.size() - 1);
                } else {
                    stk.add(i);
                }
            }
        }
        return !stk.isEmpty() ? stk.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }

}
