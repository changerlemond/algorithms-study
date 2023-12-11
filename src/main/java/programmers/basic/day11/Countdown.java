package programmers.basic.day11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Countdown {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
    }

    public static int[] solution(int start, int end_num) {
        return IntStream.iterate(start, i -> i - 1)
                .limit((start - end_num) + 1)
                .toArray();
    }

}
