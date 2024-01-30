package programmers.basic.day23;

public class TailSubstring {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(solution(new String[]{"abc", "bbc", "cbc"}, "c"));
    }

    public static String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (String s : str_list) {
            if (!s.contains(ex)) {
                answer.append(s);
            }
        }
        return answer.toString();
    }

}
