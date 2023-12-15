package programmers.basic.day12;

import java.util.Arrays;

public class SliceArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }

    public static int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

}
