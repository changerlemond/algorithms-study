package programmers.level0.day13;

public class ControlZ {

    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        String[] strings = s.split(" ");
        int result = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("Z")) {
                result -= Integer.parseInt(strings[i - 1]);
            } else {
                result += Integer.parseInt(strings[i]);
            }
        }
        return result;
    }

}
