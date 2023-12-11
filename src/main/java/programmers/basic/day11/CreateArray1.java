package programmers.basic.day11;

import java.util.Arrays;

public class CreateArray1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
        System.out.println(Arrays.toString(solution(15, 5)));
    }

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 1; i <= n / k; i++) {
            answer[i - 1] = i * k;
        }
        return answer;
    }

}
