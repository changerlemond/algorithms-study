package programmers.basic.day5;

public class DiceGame2 {

    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }

    public static int solution(int a, int b, int c) {
        int result;
        if (a != b && b != c && a != c) {
            result = a + b + c;
        } else if (a == b && b == c) {
            result = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else {
            result = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        return result;
    }

}
