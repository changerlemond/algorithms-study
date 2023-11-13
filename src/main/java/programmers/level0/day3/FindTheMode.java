package programmers.level0.day3;

import java.util.Arrays;

public class FindTheMode {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[]{1, 1, 2, 2}));
        System.out.println(solution(new int[]{1}));
    }

    public static int solution(int[] array) {
        int answer = 0;
        int maxNumber;

        // 1. 배열을 오름차순으로 정렬한다.
        Arrays.sort(array);

        // 2. 가장 큰 수를 maxNumber 로 설정한다.
        maxNumber = array[array.length - 1];

        /*
        3. 각 수의 count 해주는 배열을 만들어준다.
        (배열 index 는 0 부터 시작하므로 길이는 maxNumber + 1)
         */
        int[] count = new int[maxNumber + 1];
        for (int j : array) {
            count[j]++;
        }
        maxNumber = count[0];

        // 4. 가장 큰 count 값을 maxNumber 로 설정한다.
        for (int i = 1; i < count.length; i++) {
            if (maxNumber < count[i]) {
                maxNumber = count[i];
                // max 값이 바뀔 때 index
                answer = i;
            } else if (maxNumber == count[i]) {
                // 최빈값이 여러 개인 경우 -1 을 return 한다.
                answer = -1;
            }
        }
        // 5. 최빈값을 return 한다.
        return answer;

    }

}
