package programmers.level1;

public class SumBetweenTwoIntegers {

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    public static long solution(int a, int b) {
        return (long) (a + b) * (Math.abs(b - a) + 1) / 2;
    }

}
