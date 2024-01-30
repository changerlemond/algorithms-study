package programmers.basic.day23;

public class DiceGame1 {

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(6, 1));
        System.out.println(solution(2, 4));
    }

    public static int solution(int a, int b) {
        int score = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            score += (a * a) + (b * b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            score += Math.abs(a - b);
        } else {
            score += 2 * (a + b);
        }
        return score;
    }

}
