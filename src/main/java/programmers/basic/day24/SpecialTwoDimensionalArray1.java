package programmers.basic.day24;

import java.util.Arrays;

public class SpecialTwoDimensionalArray1 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
        System.out.println(Arrays.deepToString(solution(6)));
        System.out.println(Arrays.deepToString(solution(1)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }

}
