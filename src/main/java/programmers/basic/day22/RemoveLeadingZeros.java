package programmers.basic.day22;

public class RemoveLeadingZeros {

    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }

    public static String solution(String n_str) {
        return "" + Integer.parseInt(n_str);
    }

}
