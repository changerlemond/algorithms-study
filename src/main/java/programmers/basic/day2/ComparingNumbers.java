package programmers.basic;

public class ComparingNumbers {

    public static void main(String[] args) {
        System.out.println(solution(1, -1));
        System.out.println(solution(1, 1));
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

}
