package programmers.level1;

import java.util.Arrays;
import java.util.stream.LongStream;

public class NumbersWithXInterval {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }

    public static long[] solution(int x, int n) {
        return LongStream.range(0, n).map(i -> (long) x + i * x).toArray();
    }

}
