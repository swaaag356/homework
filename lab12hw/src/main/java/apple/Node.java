package apple;

public class Node {
    public Apple value;
    public Node next;
    public Node prev;

    public Node(Apple value) {
        this.value = value;
    }

    public Node() {
    }
}