package programmers.basic.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));
    }

    public static int[] solution(int l, int r) {
        List<Integer> array = new ArrayList<>();
        for (int i = l; i <= r ; i++) {
            String number = "" + i;
            int count = 0;
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == 48 || number.charAt(j) == 53) {
                    count++;
                }
                if (count == number.length()) {
                    array.add(i);
                }
            }
        }
        return !array.isEmpty() ? array.stream().mapToInt(i -> i).toArray() : new int[]{-1};
    }

}
