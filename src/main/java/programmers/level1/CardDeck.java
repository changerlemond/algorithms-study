package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CardDeck {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Set<String> cards = new HashSet<>(Arrays.asList(cards1));
        cards.addAll(Arrays.asList(cards2));

        int idx1 = 0;
        int idx2 = 0;

        for (String word : goal) {
            if (cards.contains(word)) {
                if (idx1 < cards1.length && cards1[idx1].equals(word)) {
                    idx1++;
                } else if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                    idx2++;
                } else {
                    return "No";
                }
            } else {
                return "No";
            }
        }

        return "Yes";
    }

}
