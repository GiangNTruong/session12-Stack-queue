package baitap;

import java.util.LinkedList;
import java.util.Queue;

public class Bai12 {
    public static int findMinElement(int[] array) {
        Queue<Integer> elementQueue = new LinkedList<>();

        // Duyệt qua từng phần tử trong mảng và đưa vào queue
        for (int element : array) {
            elementQueue.add(element);
        }

        // Lấy phần tử đầu tiên ra khỏi queue
        int minElement = elementQueue.poll();

        // So sánh với các phần tử khác trong queue để tìm phần tử nhỏ nhất
        while (!elementQueue.isEmpty()) {
            int currentElement = elementQueue.poll();
            if (currentElement < minElement) {
                // Đưa phần tử nhỏ hơn vào cuối queue
                elementQueue.add(minElement);
                // Cập nhật phần tử nhỏ nhất
                minElement = currentElement;
            } else {
                // Đưa phần tử vào cuối queue
                elementQueue.add(currentElement);
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        int[] inputArrray = {3,5,1,6,8,4,3,2,1};
        int minElement = findMinElement(inputArrray);
        System.out.println("Min là : " + minElement);
    }

}
