package programmers.introductory.day25;

public class PaperCutting {

    public static void main(String[] args) {
        System.out.println(solution(2, 2));
        System.out.println(solution(2, 5));
        System.out.println(solution(1, 1));
    }

    public static int solution(int M, int N) {
        return M * N -1;
    }

}
