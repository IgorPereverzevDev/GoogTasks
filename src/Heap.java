import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Heap {

    private List<Node> theHeap;
    private List<Node> workHeap;

    Heap(int maxSize) {
        theHeap = new ArrayList<>(maxSize);
    }

    private void heapSort() {
        for (var k = workHeap.size() - 1; k >= 0; --k) {
            workHeap.add(pop());
        }


    }

    public void insert(int num) {
        theHeap.add(new Node(num));
        workHeap = new ArrayList<>(theHeap);
        if (workHeap.size() != 1) {
            heapSort();
        }
        calculateMedian();
    }

    private void calculateMedian() {
        var pivotal = (workHeap.size() - 1) >>> 1;
        if ((workHeap.size() & 1) == 0) {
            var median = (workHeap.get(pivotal).key + workHeap.get(pivotal + 1).key) >>> 1;
            System.out.println((double) median);
        } else {
            System.out.println((double) workHeap.get(pivotal).key);
        }
    }

    private Node pop() {
        var root = workHeap.get(0);
        heapTheArray(workHeap.size() - 1);
        return root;
    }

    private void heapTheArray(int num) {
        var largestChild = 0;
        while (workHeap.size() < workHeap.size() >>> 1) {
            var leftChild = 2 * num + 1;
            var rightChild = leftChild + 1;
            if (rightChild < workHeap.size() && workHeap.get(leftChild).key < workHeap.get(rightChild).key) {
                largestChild = rightChild;
            }
            if (leftChild < workHeap.size() && workHeap.get(rightChild).key < workHeap.get(leftChild).key) {
                largestChild = leftChild;
            }
            if (workHeap.get(num).key >= workHeap.get(largestChild).key) {
                break;
            }
            workHeap.set(num, workHeap.get(largestChild));
            num = largestChild;
        }
        workHeap.set(num, workHeap.get(num));
    }

    class Node {
        int key;

        Node(int key) {
            this.key = key;
        }

    }
}

class Solution {

    public static void main(String[] args) {
        var heap = new Heap(6);
        int[] a = {12, 4, 5};
        //int[] a = {12, 4, 5, 3, 8, 7};
        for (var anA : a) {
            heap.insert(anA);

        }
    }
}






