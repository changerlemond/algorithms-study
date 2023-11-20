package programmers.introductory.day4;

public class SharingPizza1 {

    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        return (n + 6) / 7;
    }

}
