package programmers.basic.day10;

public class QRCode {

    public static void main(String[] args) {
        System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(solution(1, 0, "programmers"));
    }

    public static String solution(int q, int r, String code) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                stringBuilder.append(code.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

}
