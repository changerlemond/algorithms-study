package programmers.basic.day12;

import java.util.Arrays;

public class AreaOfTwo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
    }

    public static int[] solution(int[] arr) {
        int min = 100_000;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        if (min <= max) {
            return Arrays.copyOfRange(arr, min, max + 1);
        } else {
            return new int[]{-1};
        }
    }

}
