package programmers.basic.day4;

public class ReturnValuesByOddEven {

    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int result = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                result += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                result += (int) Math.pow(i, 2);
            }
        }
        return result;
    }

}
