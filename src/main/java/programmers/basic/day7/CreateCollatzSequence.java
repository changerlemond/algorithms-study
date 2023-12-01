package programmers.basic.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateCollatzSequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }

    public static int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(n);

        while (n != 1) {
            n = (n % 2 == 0) ? n /= 2 : 3 * n + 1;
            result.add(n);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}
