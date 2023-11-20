package programmers.introductory.day24;

import java.math.BigInteger;

public class BinaryAddition {

    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }

    public static String solution(String bin1, String bin2) {
        BigInteger num1 = new BigInteger(bin1, 2);
        BigInteger num2 = new BigInteger(bin2, 2);
        return num1.add(num2).toString(2);
    }

}
