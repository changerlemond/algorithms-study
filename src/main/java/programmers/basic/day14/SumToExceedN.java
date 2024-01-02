package programmers.basic.day14;

public class SumToExceedN {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(solution(new int[]{58, 44, 27, 10, 100}, 139));
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) break;
        }
        return answer;
    }

}
