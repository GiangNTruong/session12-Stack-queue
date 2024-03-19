package baitap;

import java.util.Stack;

public class Bai11 {
    public static int findMaxElement (int[] array){
        Stack<Integer> stack = new Stack<>();
        int maxElement = Integer.MIN_VALUE; // Giả sử phần tử max là nhỏ nhất của Interger
        for (int element : array){
            // đưa phâ tử vào stack
            stack.push(element);
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] inputArrray = {2,4,7,4,8,5,9,6};
        int maxElement = findMaxElement(inputArrray);
        System.out.println("Max là " +maxElement);
    }
}
