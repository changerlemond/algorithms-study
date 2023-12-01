package programmers.basic.day7;

import java.util.Arrays;

public class SequencesAndRangeQueries4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) {
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }

}
