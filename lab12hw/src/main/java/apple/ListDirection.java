package apple;

public class ListDirection {

    private Node first;

    public void add(Apple value) {
        if (first == null) {
            first = new Node(value);
        }
        else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
            current.next.prev = current;
        }
    }

    public boolean add(int position, Apple value) {
        int cnt = findLastindex();
        Node current = first;
        if (position <= cnt){
            Node news = new Node(value);
            current = first;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            Node prevPositionNode = current;
            current.prev.next = news;
            news.prev = current.prev;
            news.next = prevPositionNode;
            prevPositionNode.prev = news;
            return true;
        } else if (position == cnt + 1 ) {
            add(value);
        } else {
            return false;
        }
        return false;

    }

    public void sort() {
        Node current = first;
        int cnt = findLastindex();
        for (int i = cnt; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (current.value.getPrice() > current.next.value.getPrice()) {
                    Apple value1 = current.value;
                    current.value = current.next.value;
                    current.next.value = value1;
                }
                current = current.next;
            }
            current = first;
        }
    }

    public Apple pop() {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        return current.value;
    }

    public Apple pop(int position) {
        Node current = first;
        for (int i = 1; i < position-1; i++) {
            current = current.next;
        }
        Node current1 = current.next;
        current.next = current.next.next;
        current.next.next.prev = current;
        return current1.value;
    }

    public void remove(int position) {
        Node current = first;
        for (int i = 1; i < position-1; i++) {
            current = current.next;
        }
        Node current1 = current.next;
        current.next = current.next.next;
        current.next.next.prev = current;
    }

    public void printReverse() {
        Node current = first;
        for (int i = findLastindex()-1; i >= 0; i--) {
            current = first;
            for (int j = 0; j < i; j++) {
                current = current.next;
            }
            if (i==0) {
                System.out.println(current.value);
                return;
            }
            System.out.print(current.value+ " | ");
        }
    }

    public void print() {
        Node current = first;
        System.out.print(first.value);
        while (current.next != null) {
            System.out.print(" | " + current.next.value);
            current = current.next;
        }
        System.out.println();
    }

    public int findLastindex() {
        int cnt = 1;
        Node current = first;
        while (current.next != null) {
            cnt++;
            current = current.next;
        }
        return cnt;
    }
}