package programmers.basic.day3;

public class ConcatenatingLarger {

    public static void main(String[] args) {
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
    }

    public static int solution(int a, int b) {
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        return Math.max(Integer.parseInt(aString + bString), Integer.parseInt(bString + aString));
    }

}
