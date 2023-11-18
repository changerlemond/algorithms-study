package programmers.level0.day19;

public class NumberOfSeven {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }

    public static int solution(int[] array) {
        int result = 0;
        for (int j : array) {
            char[] number = (Integer.toString(j)).toCharArray();
            for (char i : number) {
                if (i == '7') {
                    result++;
                }
            }
        }
        return result;
    }

}
