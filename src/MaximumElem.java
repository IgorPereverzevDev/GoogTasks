import java.util.Scanner;
import java.util.Stack;

public class MaximumElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        Stack<StackNode> stack = new Stack<>();
        while (n > 0) {
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    int val = sc.nextInt();
                    max = Math.max(val, max);
                    stack.add(new StackNode(val, max));
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        stack.pop();
                        if(stack.isEmpty()){
                            max = Integer.MIN_VALUE;
                        }
                    }
                    break;
                case 3:
                    if(!stack.isEmpty()) {
                        System.out.println(stack.peek().curMax);
                    }
                    break;
            }
            n--;
        }
        sc.close();
    }


    private static class StackNode {
        int val;
        int curMax;

        public StackNode(int val, int curMax) {
            this.val = val;
            this.curMax = curMax;
        }

        public String toString() {
            return val + " [" + curMax + "]";
        }
    }

}
