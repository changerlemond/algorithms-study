package programmers.basic.day6;

public class HandlingNumbers1 {

    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    public static int solution(int n, String control) {
        for (int i = 0; i < control.toCharArray().length; i++) {
            switch (control.charAt(i)) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        return n;
    }

}
