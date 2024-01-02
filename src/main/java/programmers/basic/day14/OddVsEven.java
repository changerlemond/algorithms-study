package programmers.basic.day14;

public class OddVsEven {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }

    public static int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Math.max(odd, even);
    }

}
