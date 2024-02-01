package programmers.level1;

public class CountPAndYInString {

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution1("pPoooyY"));
        System.out.println(solution("Pyy"));
        System.out.println(solution1("Pyy"));
    }

    public static boolean solution(String s) {
        String string = s.toLowerCase();
        char[] array = string.toCharArray();
        int p = 0;
        int y = 0;

        for (char c : array) {
            if ('p' == c) {
                p += 1;
            } else if ('y' == c) {
                y += 1;
            }
        }

        return p == y;
    }

    public static boolean solution1(String s) {
        s = s.toLowerCase();
        return s.chars().filter(p -> 'p' == p).count() == s.chars().filter(y -> 'y' == y).count();
    }

}
