package programmers.basic.day3;

public class ComparingResultTwoNumberOperations {

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }

    public static int solution(int a, int b) {
        int compareA = Integer.parseInt(a + "" + b);
        int compareB = 2 * a * b;

        return Math.max(compareA, compareB);
    }

}
