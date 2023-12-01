package programmers.basic.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 4, 2, 5, 3})));
    }

    public static int[] solution(int[] arr) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.length;) {
            if (array.isEmpty()) {
                array.add(arr[i]);
                i++;
            } else {
                if (array.get(array.size() - 1) < arr[i]) {
                    array.add(arr[i]);
                    i++;
                } else {
                    array.remove(array.size() - 1);
                }
            }
        }
        return array.stream().mapToInt(i -> i).toArray();
    }

}
