package thuchanh2;

public class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}
