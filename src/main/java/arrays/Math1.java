package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Math1 {



    public static int sumAndCost(Integer[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(arr));
        int sum = priorityQueue.poll();
        int cost = 0;
        while (!priorityQueue.isEmpty()) {
            int currentElement = priorityQueue.poll();
            if (currentElement < sum) {
                priorityQueue.add(sum);
                sum = currentElement;
            } else {
                sum += currentElement;
                cost += sum;
                continue;
            }

            sum += priorityQueue.poll();
            cost += sum;
        }

        return cost;
    }

    public static void main(String[] args) {


        Integer[] a = {4,6,8};
        System.out.println(sumAndCost(a));
    }
}
