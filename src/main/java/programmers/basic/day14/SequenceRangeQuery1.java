package programmers.basic.day14;

import java.util.Arrays;

public class SequenceRangeQuery1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}})));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }

}
