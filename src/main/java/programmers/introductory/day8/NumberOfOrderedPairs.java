package programmers.introductory.day8;

public class NumberOfOrderedPairs {

    public static void main(String[] args) {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        return result;
    }

}
