package programmers.level1;

import java.util.Arrays;

public class FindAverage {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{5, 5}));
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

}
