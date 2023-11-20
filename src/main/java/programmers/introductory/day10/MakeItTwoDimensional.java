package programmers.introductory.day10;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeItTwoDimensional {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }

    public static int[][] solution(int[] num_list, int n) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
            list.add(Arrays.copyOfRange(num_list, i, Math.min(num_list.length, i + n)));
        }
        return list.toArray(new int[list.size()][n]);
    }

}
