package programmers.basic.day25;

import java.util.Arrays;

public class MakeSquare {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {3, 4}})));
    }

    public static int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] answer;

        if (row > col) {
            answer = new int[row][row];
            for (int i = 0; i < row; i++) {
                System.arraycopy(arr[i], 0, answer[i], 0, col);
            }
        } else if (col > row) {
            answer = new int[col][col];
            for (int i = 0; i < row; i++) {
                System.arraycopy(arr[i], 0, answer[i], 0, col);
            }
        } else {
            answer = arr;
        }

        return answer;
    }

}
