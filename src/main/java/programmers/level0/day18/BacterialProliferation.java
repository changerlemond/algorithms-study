package programmers.level0.day18;

public class BacterialProliferation {

    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {
        return n << t;
    }

}
