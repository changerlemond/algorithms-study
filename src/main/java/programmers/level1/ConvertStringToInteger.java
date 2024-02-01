package programmers.level1;

public class ConvertStringToInteger {

    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }

}
