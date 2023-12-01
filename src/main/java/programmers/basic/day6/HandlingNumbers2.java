package programmers.basic.day6;
public class HandlingNumbers2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }

    public static String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1:
                    result.append("w");
                    break;
                case -1:
                    result.append("s");
                    break;
                case 10:
                    result.append("d");
                    break;
                case -10:
                    result.append("a");
                    break;
                default:
                    break;
            }
        }
        return result.toString();
    }

}
