package programmers.basic.day20;

import java.util.Arrays;

public class Last5Places {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }

    public static int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }

}
