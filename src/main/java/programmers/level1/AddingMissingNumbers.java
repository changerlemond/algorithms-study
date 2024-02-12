package programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddingMissingNumbers {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution1(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
        System.out.println(solution1(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }

    public static int solution(int[] numbers) {
        return IntStream.rangeClosed(1, 9).filter(i -> Arrays.stream(numbers).noneMatch(num -> num == i)).sum();
    }
    
    public static int solution1(int[] numbers) {
        int result = 45;
        for (int i : numbers) {
            result -= i;
        }
        return result;
    }

}
