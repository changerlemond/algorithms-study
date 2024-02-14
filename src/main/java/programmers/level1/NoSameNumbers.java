package programmers.level1;

import java.util.Arrays;
import java.util.Stack;

public class NoSameNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3})));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) stack.push(arr[i]);
            else if (stack.peek() != arr[i]) stack.push(arr[i]);
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

}
