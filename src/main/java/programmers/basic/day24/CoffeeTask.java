package programmers.basic.day24;

public class CoffeeTask {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }

    public static int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }

}
