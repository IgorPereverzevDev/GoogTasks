import java.util.Objects;
import java.util.Stack;
import java.util.regex.Pattern;

public class BaseballGame {
    private int sum =0;

    public int calPoints(String[] ops) {
        if (ops == null) {
            return 0;
        }
        Pattern pattern = Pattern.compile("-?\\d+");
        Stack<Integer> stack = new Stack<>();
        String s = "+";
        String d = "D";
        String c = "C";
        for (String op : ops) {
            if (Objects.equals(op, s)) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(stack.push(a) + b);
                sum += a + b;
            } else if (Objects.equals(op, d)) {
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else if (Objects.equals(op, c)) {
                sum -= stack.pop();
            } else if (pattern.matcher(op).matches()) {
                stack.push(Integer.valueOf(op));
                sum += Integer.valueOf(op);
            } else {
                System.out.print("value is not correct");
                break;
            }
        }
        return sum;
    }
}
