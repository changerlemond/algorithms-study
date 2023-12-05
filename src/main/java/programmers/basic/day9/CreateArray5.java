package programmers.basic.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray5 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        for (String intStr : intStrs) {
            String number = intStr.substring(s, s + l);
            if (Integer.parseInt(number) > k) {
                result.add(Integer.parseInt(number));
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

}
