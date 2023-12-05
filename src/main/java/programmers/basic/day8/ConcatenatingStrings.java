package programmers.basic.day8;

public class ConcatenatingStrings {

    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(solution("zpiaz", new int[]{1, 2, 0, 0, 3}));
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i : index_list) {
            char[] array = my_string.toCharArray();
            answer.append(array[i]);
        }
        return answer.toString();
    }
}
