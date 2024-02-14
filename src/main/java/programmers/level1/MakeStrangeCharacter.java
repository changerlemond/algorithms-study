package programmers.level1;

public class MakeStrangeCharacter {

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        String[] array = s.split(" ", -1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                char c = array[i].charAt(j);
                if (j % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
            if (i < array.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
