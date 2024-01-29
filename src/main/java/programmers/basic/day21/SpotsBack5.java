package programmers.basic.day21;

import java.util.Arrays;

public class SpotsBack5 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }

    public static int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }

}
