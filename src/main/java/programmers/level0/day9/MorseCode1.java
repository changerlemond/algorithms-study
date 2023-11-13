package programmers.level0.day9;

import java.util.HashMap;

public class MorseCode1 {

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }

    public static String solution(String letter) {
        HashMap<String, Character> morse = new HashMap<>() {{
            put(".-", 'a');
            put("-...", 'b');
            put("-.-.", 'c');
            put("-..", 'd');
            put(".", 'e');
            put("..-.", 'f');
            put("--.", 'g');
            put("....", 'h');
            put("..", 'i');
            put(".---", 'j');
            put("-.-", 'k');
            put(".-..", 'l');
            put("--", 'm');
            put("-.", 'n');
            put("---", 'o');
            put(".--.", 'p');
            put("--.-", 'q');
            put(".-.", 'r');
            put("...", 's');
            put("-", 't');
            put("..-", 'u');
            put("...-", 'v');
            put(".--", 'w');
            put("-..-", 'x');
            put("-.--", 'y');
            put("--..", 'z');
        }};

        String[] words = letter.trim().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            for (String message : word.split(" ")) {
                result.append(morse.get(message));
            }
        }

        return result.toString();
    }

}
