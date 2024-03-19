package baitap;

import java.util.Stack;

public class Bai2 {
//Viết chương trình sử dụng stack để kiểm tra xem một chuỗi đầu vào có cặp dấu ngoặc đúng hay không.

//    Dưới đây là một đoạn mã Java đơn giản mà bạn có thể sử dụng để kiểm tra xem một chuỗi có cặp dấu ngoặc đúng hay không sử dụng Stack:
//
//    Java
        public static void main(String[] args) {
            String input = "{[(a)]}"; // Chuỗi đầu vào
            if (isValid(input)){
                System.out.println("đúng");
            }else {
                System.out.println("ko đúng");
            }
        }
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    if (c==')' || c== '}' || c == ']'){
                        return false;
                    }


                }
            }
            return stack.isEmpty();
        }

    }

