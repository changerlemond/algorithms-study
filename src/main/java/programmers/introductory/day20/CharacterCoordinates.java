package programmers.introductory.day20;

import java.util.Arrays;

public class CharacterCoordinates {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int minX = board[0] / 2;
        int minY = board[1] / 2;

        int calculateX = 0;
        int calculateY = 0;

        for (String direction : keyinput) {
            switch (direction) {
                case "up":
                    calculateY++;
                    if (Math.abs(calculateY) >= Math.abs(minY)) {
                        calculateY = minY;
                    }
                    break;
                case "down":
                    calculateY--;
                    if (Math.abs(calculateY) >= Math.abs(minY)) {
                        calculateY = -minY;
                    }
                    break;
                case "left":
                    calculateX--;
                    if (Math.abs(calculateX) >= Math.abs(minX)) {
                        calculateX = -minX;
                    }
                    break;
                case "right":
                    calculateX++;
                    if (Math.abs(calculateX) >= Math.abs(minX)) {
                        calculateX = minX;
                    }
                    break;
            }
        }

        return new int[]{calculateX, calculateY};
    }

}
