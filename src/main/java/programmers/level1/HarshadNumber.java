package programmers.level1;

public class HarshadNumber {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        String numString = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            sum += numString.charAt(i) - '0';
        }

        return x % sum == 0;
    }

}
