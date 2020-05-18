import java.util.Iterator;

public class MyLinkedList implements Iterable<Double> {
    private Node head;
    private Node tail;
    private int size;


    @Override
    public Iterator<Double> iterator() {
        class RangeIterator implements Iterator<Double>{

            private Node next;

            private RangeIterator(Node firstElement){next = firstElement;}

            @Override
            public boolean hasNext() {
                return next != null;
            }

            @Override
            public Double next() {
                double element = next.item;
                next = next.next;
                return element;
            }
        }
        return new RangeIterator(head);
    }


    public class Node {
        Node next;
        double item;

        public Node(Node next, double item) {
            this.next = next;
            this.item = item;
        }
    }


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public double getHeadValue() {
        return head.item;
    }

    public double getTailValue() {
        return tail.item;
    }

    private Node getHead() {
        return head;
    }

    private Node getTail() {
        return tail;
    }

    public int size() {
        return size;
    }

    public void addFirst(double item) {
        Node node = new Node(null, item);
        if (isEmpty()) {
            tail = node;
        } else {
            node.next = head;
        }
        head = node;
        size++;
    }

    public void addLast(double item) {
        Node node = new Node(null, item);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void remove(int index) {
        if (!isEmpty()) {
            if (index == 0) {
                head = head.next;
            }

            if (0 < index && index < size - 1) {
                Node node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.next;
                }
                node.next = node.next.next;
            }
            size--;
        }
    }

    public double get(int index) {
        if (!isEmpty()) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.item;
        }
        return 0;
    }

    public static class MinMaxResult {
        private int minCount, maxCount;

    }

    public int[] MinMaxResult() {
        int[] result = new int[3];
        Node node = head;
        if (node.item < node.next.item) {
            result[1]++;
        }
        if (node.item > node.next.item) {
            result[2]++;
        }
        while (node.next.next != null) {
            if (node.next.item < node.next.next.item &&
                    node.item > node.next.item) {
                result[1]++;
            }
            if (node.next.item > node.next.next.item &&
                    node.item < node.next.item) {
                result[2]++;
            }
            node = node.next;
        }
        if (node.item > node.next.item) {
            result[1]++;
        }
        if (node.item < node.next.item) {
            result[2]++;
        }
        result[0] = result[1] + result[2];
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}