package programmers.basic.day15;

public class MakeNumber1 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                num_list[i] /= 2;
                answer++;
            }
        }
        return answer;
    }

}
