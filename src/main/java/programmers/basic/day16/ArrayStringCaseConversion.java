package programmers.basic.day16;

import java.util.Arrays;

public class ArrayStringCaseConversion {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(solution(new String[]{"aBc", "AbC"})));
    }

    public static String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }

}
