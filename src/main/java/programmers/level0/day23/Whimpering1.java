package programmers.level0.day23;

public class Whimpering1 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public static int solution(String[] babbling) {
        int result = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "0");
            babbling[i] = babbling[i].replaceFirst("woo", "0");
            babbling[i] = babbling[i].replaceFirst("ye", "0");
            babbling[i] = babbling[i].replaceFirst("ma", "0");
            babbling[i] = babbling[i].replace("0", "");

            if (babbling[i].isEmpty()) {
                result++;
            }
        }

        return result;
    }

}
