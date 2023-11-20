package programmers.introductory.day3;

import static java.util.Arrays.sort;

public class FindingTheMedian {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{2, 3, 4, 6, 9, 10}));
    }

    public static int solution(int[] array) {
        sort(array);
        int length = array.length;
        int middleIndex = length / 2;
        return array[middleIndex];
    }

}
