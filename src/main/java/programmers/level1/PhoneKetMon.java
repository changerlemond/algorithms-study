package programmers.level1;

import java.util.HashSet;

public class PhoneKetMon {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public static int solution(int[] nums) {
        HashSet<Integer> num = new HashSet<>();

        for (int n : nums) {
            num.add(n);
        }

        return Math.min(num.size(), nums.length / 2);
    }

}
