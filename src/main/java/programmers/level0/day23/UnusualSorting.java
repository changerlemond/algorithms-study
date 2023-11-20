package programmers.level0.day23;

import java.util.Arrays;

public class UnusualSorting {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
        System.out.println(Arrays.toString(solution1(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] - n < 0) {
                order[i] = Math.abs(numlist[i] - n) + 0.5;
            } else {
                order[i] = numlist[i] - n;
            }
        }

        Arrays.sort(order);

        for (int i = 0; i < numlist.length; i++) {
            if (order[i] % 1 != 0) {
                answer[i] = n - (int) order[i];
            } else {
                answer[i] = (int) order[i] + n;
            }
        }

        return answer;
    }


    // 스트림을 이용한 풀이
    public static int[] solution1(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
