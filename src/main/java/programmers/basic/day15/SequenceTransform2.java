package programmers.basic.day15;

public class SequenceTransform2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] beforeArr;

        while (count != arr.length) {
            count = 0;
            beforeArr = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] <= 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }

                if (arr[i] == beforeArr[i]) {
                    count++;
                }
            }
            answer++;
        }
        return answer - 1;
    }

}
