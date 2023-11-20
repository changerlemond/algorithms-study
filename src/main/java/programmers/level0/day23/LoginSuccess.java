package programmers.level0.day23;

public class LoginSuccess {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }

    public static String solution(String[] id_pw, String[][] db) {
        int result = 0;

        for (String[] strings : db) {
            if (strings[0].equals(id_pw[0]) && strings[1].equals(id_pw[1])) {
                result = 0;
                break;
            } else if (strings[0].equals(id_pw[0])) {
                result = 1;
                break;
            } else {
                result = 2;
            }
        }

        if (result == 0) {
            return "login";
        } else if (result == 1) {
            return "wrong pw";
        } else {
            return "fail";
        }

    }

}
