package programmers.basic.day5;

public class JoinNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        StringBuilder oddNumber = new StringBuilder();
        StringBuilder evenNumber = new StringBuilder();

        for (int i : num_list) {
            if (i % 2 == 0) {
                evenNumber.append(i);
            } else {
                oddNumber.append(i);
            }
        }

        return Integer.parseInt(oddNumber.toString()) + Integer.parseInt(evenNumber.toString());
    }

}
