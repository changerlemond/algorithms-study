package programmers.level0.day17;

import java.util.stream.IntStream;

public class FindNumber {

    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, -1));
    }

    public static int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }

}
