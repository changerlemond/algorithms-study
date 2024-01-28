package programmers.basic.day19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UseArrayElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
    }

    public static int[] solution(int[] arr) {
        return IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(0, arr[i])
                        .mapToObj(j -> arr[i]))
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
