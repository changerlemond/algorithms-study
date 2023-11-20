package programmers.introductory.day4;

public class SharingPizza3 {

    public static void main(String[] args) {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }

    public static int solution(int slice, int n) {
        return (n + slice - 1) / slice;
    }

}
