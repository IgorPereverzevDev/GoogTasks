import java.util.*;
import java.util.LinkedList;

class GeneratorString {

    static Queue solution(String str) {

        Queue<String> queue = new LinkedList<>();
        queue.offer(str);
        int index = 0;

        while (!queue.isEmpty()) {

            String newString = getFromQueue(queue, index);

            char[] symb = newString.toCharArray();
            index = newString.indexOf('?');

            if (index != symb.length && index != -1) {
                symb[index] = '0';
                queue.offer(String.copyValueOf(symb));

                symb[index] = '1';
                queue.offer(String.copyValueOf(symb));
                ++index;
            } else {
                System.out.println(newString);
                queue.poll();
            }
        }
        return queue;
    }

    private static <T> T getFromQueue(Queue<T> queue, int index) {
        if (index >= queue.size()) {
            throw new IndexOutOfBoundsException("index=" + index + ",size=" + queue.size());
        }
        Queue<T> queueCopy = new LinkedList<>(queue);
        for (int i = 0; i < index; i++) {
            queueCopy.remove();
        }
        return queueCopy.peek();
    }

    public static void main(String[] args) {
        String str = "1??0?101";
        solution(str);
    }
}

