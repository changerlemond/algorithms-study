package programmers.level1;

public class SmallSubstring {

    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }

}
