package thuchanh2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);
        System.out.println("------"+ queue);
    }
}
