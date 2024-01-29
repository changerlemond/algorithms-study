package programmers.basic.day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NationalCompetitionSelectionExam {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
        System.out.println(solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
    }

    public static int solution(int[] rank, boolean[] attendance) {
        List<int[]> rankIndex = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                rankIndex.add(new int[]{rank[i], i});
            }
        }
        rankIndex.sort(Comparator.comparingInt(arr -> arr[0]));
        return rankIndex.get(0)[1] * 10000 + rankIndex.get(1)[1] * 100 + rankIndex.get(2)[1];
    }

}
