package programmers.level1;

public class Watermelon {

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        return n % 2 == 0 ? "수박".repeat(n / 2) : "수박".repeat(n / 2) + "수";
    }

}
