public class QueueStack<E> implements MyQueue<E>, MyStack<E> {
    private int size;
    private Node head;
    private Node tail;

    private class Node {
        Node prev;
        Node next;
        E item;

        public Node(Node prev, Node next, E item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    public QueueStack() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean offer(E item) {
        Node node = new Node(null, null, item);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public E peekQueue() {
        return head.item;
    }

    @Override
    public boolean push(E item) {
        Node node = new Node(null, null, item);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
        return true;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            E item = head.item;
            head = head.next;
            if(head != null) {
                head.prev = null;
            }
            else {
                tail = null;
            }
            size--;
            return item;
        } else return null;
    }

    @Override
    public E peekStack() {
        return tail.item;
    }

    @Override
    public E poll() {
        if (!isEmpty()) {
            E item = tail.item;
            tail = tail.prev;
            if(tail != null) {
                tail.next = null;
            }
            else {
                head = null;
            }
            size--;
            return item;
        } else return null;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void printForward() {

        System.out.println("--- Forward ---");
        Node current = head;
        while (current != null) {
            System.out.print(current.item);
            current = current.next;
        }
        System.out.println();
        System.out.println("--- Forward end ---");
    }

    public void printBackward() {

        System.out.println("--- Backward ---");
        Node current = tail;
        while (current != null) {
            System.out.print(current.item);
            current = current.prev;
        }
        System.out.println();
        System.out.println("--- Backward end ---");
    }
}