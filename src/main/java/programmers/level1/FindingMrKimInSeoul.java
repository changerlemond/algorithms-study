package programmers.level1;

public class FindingMrKimInSeoul {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    public static String solution(String[] seoul) {
        int result = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = i;
                break;
            }
        }
        return String.format("김서방은 %d에 있다", result);
    }

}
