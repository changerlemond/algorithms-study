package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }

    public static int[] solution(int k, int[] score) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i : score) {
            if (priorityQueue.size() >= k) {
                if (priorityQueue.peek() < i) {
                    priorityQueue.poll();
                    priorityQueue.add(i);
                }
            } else {
                priorityQueue.add(i);
            }

            result.add(priorityQueue.peek());
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}
