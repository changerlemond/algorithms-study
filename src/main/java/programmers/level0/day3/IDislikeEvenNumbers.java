package programmers.level0.day3;

import java.util.Arrays;

public class IDislikeEvenNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }

    public static int[] solution(int n) {
        int [] answer = new int[(n + 1) / 2];

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[i / 2] = i;
            }
        }
        return answer;
    }

}
