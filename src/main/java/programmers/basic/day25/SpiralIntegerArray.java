package programmers.basic.day25;

import java.util.Arrays;

public class SpiralIntegerArray {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(4)));
        System.out.println(Arrays.deepToString(solution(5)));
    }

    public static int[][] solution(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (num <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                result[rowStart][i] = num++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                result[i][colEnd] = num++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                result[rowEnd][i] = num++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                result[i][colStart] = num++;
            }
            colStart++;
        }

        return result;
    }

}
