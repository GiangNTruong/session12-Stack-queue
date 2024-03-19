package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ dòng mới sau số nhập vào

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            stack.push(word);
        }

        System.out.println("Các từ theo thứ tự đảo ngược: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }

}
