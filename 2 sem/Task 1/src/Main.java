public class Main {
    public static void main(String[] args) {
        QueueStack<Integer> qsI = new QueueStack<>();
        testX3(qsI);
        qsI.printForward();
        qsI.printBackward();
    }

    private static void test3(QueueStack<Integer> qs){
        qs.offer(4);
        qs.offer(5);
        qs.offer(6);
        qs.offer(7);
        qs.offer(8);
    }

    private static void test4(QueueStack<Integer> qs){
        qs.offer(4);
        qs.offer(5);
        qs.offer(6);
        qs.offer(7);
        qs.offer(8);

        qs.push(3);
        qs.push(2);
        qs.push(1);

        System.out.println("Vynul " + qs.peekStack());
    }

    private static void test5(QueueStack<Integer> qs){
        qs.offer(4);
        qs.offer(5);
        qs.offer(6);
        qs.offer(7);
        qs.offer(8);

        qs.push(3);
        qs.push(2);
        qs.push(1);
        System.out.println("Vynul" + qs.peekQueue());
    }

    private static void test6(QueueStack<Integer> qs){
        qs.offer(4);
        qs.offer(5);
        qs.offer(6);
        qs.offer(7);
        qs.offer(8);

        qs.push(3);
        qs.push(2);
        qs.push(1);
        qs.poll();
    }

    private static void testX1(QueueStack<Integer> qs) {
        qs.push(1);
        qs.push(2);
        qs.poll();
        qs.poll();
    }

    private static void testX2(QueueStack<Integer> qs) {
        qs.offer(1);
        qs.offer(2);
        qs.poll();
        qs.poll();
    }

    private static void testX3(QueueStack<Integer> qs) {
        qs.offer(1);
        qs.offer(2);
        qs.poll();
        qs.poll();
        qs.offer(3);
    }

    private static void testX4(QueueStack<Integer> qs) {
        qs.offer(1);
        qs.offer(2);
        qs.pop();
        qs.pop();
        qs.push(3);
    }
}
