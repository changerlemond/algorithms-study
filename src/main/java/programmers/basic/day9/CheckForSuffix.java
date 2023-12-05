package programmers.basic.day9;

public class CheckForSuffix {

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
    }

    public static int solution(String my_string, String is_suffix) {
        return (my_string.endsWith(is_suffix)) ? 1 : 0;
    }

}
