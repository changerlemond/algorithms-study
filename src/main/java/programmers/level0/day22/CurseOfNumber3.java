package programmers.level0.day22;

import java.util.stream.IntStream;

public class CurseOfNumber3 {

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    public static int solution(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result++;
            while (result % 3 == 0 || String.valueOf(result).contains("3")) {
                result++;
            }
        }
        return result;
    }

}
