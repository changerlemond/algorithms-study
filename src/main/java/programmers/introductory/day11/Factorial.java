package programmers.introductory.day11;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int i = 1;
        int factorial = 1;

        while (factorial <= n) {
            i++;
            factorial *= i;
        }
        return i - 1;
    }

}
