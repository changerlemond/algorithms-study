package programmers.level1;

public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char character : s.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) ((character - base + n) % 26 + base));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

}
