package programmers.basic.day6;

import java.util.Arrays;

public class SequencesAndRangeQueries {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int index;
        for (int[] query : queries) {
            index = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = index;
        }
        return arr;
    }

}
