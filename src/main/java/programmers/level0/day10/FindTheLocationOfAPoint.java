package programmers.level0.day10;

public class FindTheLocationOfAPoint {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }

    public static int solution(int[] dot) {
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (dot[1] > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

}
