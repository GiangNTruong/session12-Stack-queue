package baitap;

import java.util.Stack;

public class Bai13 {
    public static boolean isDecreasingSequence(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (stack.isEmpty() || ch < stack.peek()) {
                stack.push(ch);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "4321";
        boolean result = isDecreasingSequence(inputString);
        if (result) {
            System.out.println("Chuỗi là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi không phải là dãy giảm dần.");
        }
    }
}
