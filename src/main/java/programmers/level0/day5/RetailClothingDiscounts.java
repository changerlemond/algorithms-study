package programmers.level0.day5;

public class RetailClothingDiscounts {

    public static void main(String[] args) {
        System.out.println(solution(150_000));
        System.out.println(solution(580_000));
    }

    public static int solution(int price) {
        if (price >= 500_000) {
            return (int) (price * 0.8);
        } else if (price >= 300_000) {
            return (int) (price * 0.9);
        } else if (price >= 100_000) {
            return (int) (price * 0.95);
        } else {
            return price;
        }
    }

}
