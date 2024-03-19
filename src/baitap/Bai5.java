package baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bai5 {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba"; // Chuỗi đầu vào
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", ""); // Loại bỏ các ký tự không phải chữ cái và chuyển thành chữ thường

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }

        return true;
    }
}
