package programmers.basic.day6;

import java.util.Arrays;

public class CountOfEvenAndOddNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }

    public static int[] solution(int[] num_list) {
        int[] list = Arrays.stream(num_list).map(num -> num % 2).toArray();
        Long evenNumberCount = Arrays.stream(list).filter(num -> num == 0).count();
        Long oddNumberCount = Arrays.stream(list).filter(num -> num == 1).count();

        return new int[]{evenNumberCount.intValue(), oddNumberCount.intValue()};
    }

    public static int[] solution1(int[] num_list) {
        int[] answer = new int[2];
        for (int j : num_list) answer[j % 2]++;
        return answer;
    }

}
