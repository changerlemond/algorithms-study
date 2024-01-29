package programmers.basic.day21;

public class ConvertingStringToInteger {

    public static void main(String[] args) {
        System.out.println(solution("10"));
        System.out.println(solution("8542"));
    }

    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

}
