package programmers.basic.day4;

public class CommonMultiple {

    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }

    public static int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }

}
