package programmers.introductory.day9;

public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        final char rock = '0';
        final char scissors = '2';
        final char paper = '5';
        char[] array = rsp.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            switch (array[i]) {
                case rock:
                    result.append(paper);
                    break;
                case scissors:
                    result.append(rock);
                    break;
                case paper:
                    result.append(scissors);
                    break;
                default:
                    break;
            }
        }

        return result.toString();
    }

}
