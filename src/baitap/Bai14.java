package baitap;

import java.util.Stack;

public class Bai14 {
    private static boolean  isPrime(int num){
        if (num<2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    private static boolean isPrimeNumberSequence(String input){
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()){
            //Kiểm tra xem ký tự phải số ko
            if (Character.isDigit(ch)){
                stack.push(ch);
            }
        }
        //Lấy ký tự stack ra kiểm tra
        while (!stack.isEmpty()){
            int num = Character.getNumericValue(stack.pop());
            if (!isPrime(num)) {
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "237";
        boolean result = isPrimeNumberSequence(inputString);
        if (result) {
            System.out.println("Chuỗi là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi không phải là dãy số nguyên tố.");
        }
    }

}
