package programmers.level1;

public class CalculateInsufficientAmount {

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long result = 0L;
        for (int i = 1; i <= count; i++) {
            result += (long) i * price;
        }
        return Math.max(result - money, 0L);
    }

}
