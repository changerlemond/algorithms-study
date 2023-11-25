package programmers.basic.day5;

public class SpecificTermSum {

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true}));
        System.out.println(solution(7, 1, new boolean[]{false, false, false, true, false, false, false}));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }
        return answer;
    }

}
