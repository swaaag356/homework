import java.util.Random;

public class mainLinkedList {
    public static void main(String[] args) {

        Random r = new Random();
        Node first = new Node(5);

        System.out.print("1. ");
        for (int i = 0; i < 29; i++) {
            addNew(first, r.nextInt(0, 100));
        }
        System.out.println(get(first, 2).value);


        System.out.print("2.");
        printLinkedList(first);
        System.out.println();
        System.out.print("3.[");
        printReverseList(first);
        System.out.println("]");
    }

    public static Node lastElement(Node first) {
        Node current = first;

        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void addNew(Node first, int value) {
        Node last = lastElement(first);
        last.next = new Node(value);
    }
    //пока next не равен 0 выводим
    public static void printLinkedList(Node first) {
        Node current = first;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    //перебираем до индекса и выводим
    public static Node get(Node first, int num) {
        Node current = first;
        for (int i = 1; i < num; i++) {
            current = current.next;
        }
        return current;
    }

    //выводим через стек
    public static void printReverseList(Node node) {
        if (node == null) {
            return;
        }
        printReverseList(node.next);
        System.out.print(node.value + " ");
    }
}
