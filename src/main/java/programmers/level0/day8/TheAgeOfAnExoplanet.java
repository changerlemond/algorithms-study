package programmers.level0.day8;

public class TheAgeOfAnExoplanet {

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        String numberString = Integer.toString(age);
        StringBuilder result = new StringBuilder();

        for (char digit: numberString.toCharArray()) {
            int index = digit - '0';
            result.append(alphabet[index]);
        }

        return result.toString();
    }

}
