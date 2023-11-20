package programmers.introductory.day16;

public class SimilarityOfArrangements {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }

    public static int solution(String[] s1, String[] s2) {
        int answer;
        int count = 0;

        for (String s : s1) {
            for (String string : s2) {
                if (s.equals(string)) {
                    count++;
                }
            }
        }
        answer = count;
        return answer;
    }

}
