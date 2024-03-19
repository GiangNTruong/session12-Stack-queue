package baitap;

import java.util.LinkedList;
import java.util.Queue;

public class Bai1 {
// Viết chương trình sử dụng queue để lưu trữ và in ra các phần tử của một danh sách đầu vào. Viết chương trình sử dụng queue để lưu trữ và in ra các phần tử của một danh sách đầu vào.
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    //Thêm phần tử
    queue.add("Phan tử 1 ");
    queue.add("Phan tử 2 ");
    queue.add("Phan tử 3 ");
    while (!queue.isEmpty()){
        System.out.println(queue.poll());
    }


}
}
