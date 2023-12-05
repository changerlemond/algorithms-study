package programmers.basic.day8;

import java.util.Arrays;

public class DiceGame3 {

    public static void main(String[] args) {
        System.out.println(solution(2, 2, 2, 2));
        System.out.println(solution(4, 1, 4, 4));
        System.out.println(solution(6, 3, 3, 6));
        System.out.println(solution(2, 5, 2, 6));
        System.out.println(solution(6, 4, 2, 5));
    }

    public static int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        int answer;

        if (dice[0] == dice[3]) {
            answer = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0];
        }

        return answer;
    }

}
