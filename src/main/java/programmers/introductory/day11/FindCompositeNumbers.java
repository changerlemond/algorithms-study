package programmers.introductory.day11;

public class FindCompositeNumbers {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int result = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

}
