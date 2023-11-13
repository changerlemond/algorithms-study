package programmers.level0.day7;

public class LambSkewers {

    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        return n * 12_000 + k * 2_000 - (n / 10 * 2_000);
    }

}
