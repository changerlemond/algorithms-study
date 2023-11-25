package programmers.basic.day4;

public class ConditionalStatementString {

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        boolean answer;
        if (ineq.equals(">") && eq.equals("="))
            answer = n >= m;
        else if (ineq.equals("<") && eq.equals("="))
            answer = n <= m;
        else if (ineq.equals(">") && eq.equals("!"))
            answer = n > m;
        else
            answer = n < m;
        return answer ? 1 : 0;
    }

}
