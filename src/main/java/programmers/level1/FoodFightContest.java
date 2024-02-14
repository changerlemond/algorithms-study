package programmers.level1;

public class FoodFightContest {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }

    public static String solution(int[] food) {
        StringBuilder a = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            a.append(("" + i).repeat(food[i] / 2));
        }
        String b = new StringBuilder(a).reverse().toString();
        return a + "0" + b;
    }

}
