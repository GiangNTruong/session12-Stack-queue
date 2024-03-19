package baitap;

import java.util.Stack;

public class Bai9 {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
        reverseArray(inputArray);
        System.out.println("Reversed array: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }
}
