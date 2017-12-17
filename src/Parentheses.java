import java.util.Stack;

/**
 * Created by zorg9 on 15.12.2017.
 */
public class Parentheses {
    static boolean solution(String str) {
        if(str.isEmpty()) {
            return false;
        }
        Stack stack = new Stack();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; ++i) {
            if (!stack.contains(array[i])) {
                char current = array[i];
                if (current == '(' || current == '{' || current == '[') {
                    stack.push(array[i]);
                }
                if (current == '}' || current == ')' || current == ']') {
                    if (stack.empty()) {
                        return false;
                    }
                    char last = (char) stack.peek();
                    if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "})][{()";
        System.out.println(solution(str));
    }

}
