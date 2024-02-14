package programmers.level1;

public class NumberDivisorsAndAddition {

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int num = left; num <= right; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;
    }

}