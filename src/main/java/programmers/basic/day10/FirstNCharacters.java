package programmers.basic.day10;

public class FirstNCharacters {

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

}
