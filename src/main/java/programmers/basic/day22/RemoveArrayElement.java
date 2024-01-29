package programmers.basic.day22;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveArrayElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})));
    }

    public static int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : delete_list) {
            set.add(num);
        }

        return Arrays.stream(arr).filter(num -> !set.contains(num)).toArray();
    }

}
