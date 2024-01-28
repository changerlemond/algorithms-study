package programmers.basic.day18;

public class EvaluateSimpleExpressions {

    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    public static int solution(String binomial) {
        String[] parts = binomial.split(" ");
        int operand1 = Integer.parseInt(parts[0]);
        int operand2 = Integer.parseInt(parts[2]);
        String operator = parts[1];

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                return 0;
        }
    }

}
