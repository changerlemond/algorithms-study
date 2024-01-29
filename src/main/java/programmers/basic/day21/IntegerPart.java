package programmers.basic.day21;

public class IntegerPart {

    public static void main(String[] args) {
        System.out.println(solution(1.42));
        System.out.println(solution(69.32));
    }

    public static int solution(double flo) {
        return ((int) flo);
    }

}
