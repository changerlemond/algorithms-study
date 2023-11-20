package programmers.introductory.day25;

public class NextNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
    }

    public static int solution(int[] common) {
        int answer;

        if ((common[1] - common[0]) == (common[2] - common[1]))
            answer = common[common.length - 1] + (common[1] - common[0]);
        else
            answer = common[common.length - 1] * (common[1] / common[0]);

        return answer;
    }

}
