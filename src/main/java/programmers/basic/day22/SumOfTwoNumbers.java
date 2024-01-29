package programmers.basic.day22;

import java.math.BigInteger;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println(solution("582", "734"));
        System.out.println(solution("18446744073709551615", "287346502836570928366"));
        System.out.println(solution("0", "0"));
    }

    public static String solution(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);
        BigInteger sum = bigInteger1.add(bigInteger2);
        return "" + sum;
    }

}
