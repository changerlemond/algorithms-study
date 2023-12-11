package programmers.basic.day10;

public class ReverseCharacters {

    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
        System.out.println(solution("Stanley1yelnatS", 4, 10));
    }

    public static String solution(String my_string, int s, int e) {
        String reverse = my_string.substring(s, e + 1);
        StringBuilder stringBuilder = new StringBuilder(reverse);
        return my_string.substring(0, s) + stringBuilder.reverse() + my_string.substring(e + 1);
    }

}
