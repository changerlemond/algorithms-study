package programmers.introductory.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindingDivisors {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
        System.out.println(Arrays.toString(solution1(24)));
        System.out.println(Arrays.toString(solution1(29)));
    }

    public static int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solution1(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }

}