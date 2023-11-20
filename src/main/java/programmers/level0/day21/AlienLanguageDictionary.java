package programmers.level0.day21;

public class AlienLanguageDictionary {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        boolean wordCheck = false;
        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                wordCheck = true;
                break;
            }
        }
        return wordCheck ? 1 : 2;
    }

}
