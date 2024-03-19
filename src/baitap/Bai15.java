package baitap;

import java.util.Stack;

public class Bai15 {
    public static String decimalToBinary(int num){
        Stack<Integer> binaryStack = new Stack<>();
        //CHuyển đổi heej thập phan sang nhị
        while (num>0){
            int remainder = num%2;
            binaryStack.push(remainder);
            num/=2;

        }
        StringBuilder binaryResult = new StringBuilder();
        while (!binaryStack.isEmpty()){
            binaryResult.append(binaryStack.pop());
        }
        return binaryResult.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 21;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println(decimalNumber + " => " + binaryNumber);
    }
}
