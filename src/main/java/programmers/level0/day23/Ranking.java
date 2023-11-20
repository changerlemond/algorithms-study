package programmers.level0.day23;

import java.util.Arrays;

public class Ranking {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
    }

    public static int[] solution(int[][] score) {
        float[] average = new float[score.length];
        for (int i = 0; i < score.length; i++) {
            average[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }

        int[] answer = new int[score.length];
        for (int j = 0; j < score.length; j++) {
            int order = 1;
            for (int k = 0; k < score.length; k++) {
                if (average[j] < average[k]) {
                    order++;
                }
                answer[j] = order;
            }
        }

        return answer;
    }

}
