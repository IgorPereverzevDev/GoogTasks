import java.util.*;

class QueueOnTheStacks {

    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTwo = new Stack<>();

    public QueueOnTheStacks(Stack<Integer> stackOne, Stack<Integer> stackTwo) {
        this.stackOne = stackOne;
        this.stackTwo = stackTwo;
    }

    private void enqueue(int a) {
        stackOne.push(a);
    }

    private int getSize() {
        return stackOne.size() + stackTwo.size();
    }

    private int dequeue() {
        if (stackOne.isEmpty()) {
            if (stackTwo.isEmpty()) {
                return 0;
            }
        }
        while (stackOne.size() > 0) {
            stackTwo.push(stackOne.pop());
        }
        return stackTwo.pop();
    }


    public static void main(String[] args) {
        //Stack one
        Stack<Integer> A = new Stack<>();
        A.push(1);
        A.push(2);
        A.push(3);
        //Stack two
        Stack<Integer> B = new Stack<>();

        int element = 5;
        QueueOnTheStacks queueOnTheStacks = new QueueOnTheStacks(A, B);

        //add element in our queue
        queueOnTheStacks.enqueue(element);
        System.out.println(queueOnTheStacks.getSize());

        //delete element from our queue
        queueOnTheStacks.dequeue();
        System.out.println(queueOnTheStacks.getSize());

    }
}
