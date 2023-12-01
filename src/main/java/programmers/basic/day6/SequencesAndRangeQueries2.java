package programmers.basic.day6;

import java.util.Arrays;

public class SequencesAndRangeQueries2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        Arrays.fill(result, Integer.MAX_VALUE);
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    result[i] = Math.min(result[i], arr[j]);
                }
            }
            if (result[i] == Integer.MAX_VALUE) result[i] = -1;
        }
        return result;
    }

}
