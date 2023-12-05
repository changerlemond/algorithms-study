package programmers.basic.day8;

public class Modulo9 {

    public static void main(String[] args) {
        System.out.println(solution("123"));
        System.out.println(solution("78720646226947352489"));
    }

    public static int solution(String number) {
        int num = 0;
        for (int i = 0; i < number.toCharArray().length; i++) {
            char[] array = number.toCharArray();
            num += Integer.parseInt(String.valueOf(array[i]));
        }
        return num % 9;
    }

}
