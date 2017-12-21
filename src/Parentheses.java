import java.util.Stack;

/**
 * Created by zorg9 on 15.12.2017.
 */
public class Parentheses {
    static boolean solution(String str) {
        if(str.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();
        for (char anArray : array) {
            if (!stack.contains(anArray)) {
                if (anArray == '(' || anArray == '{' || anArray == '[') {
                    stack.push(anArray);
                }
                if (anArray == '}' || anArray == ')' || anArray == ']') {
                    if (stack.empty()) {
                        return false;
                    }
                    char last = stack.peek();
                    if (anArray == '}' && last == '{' || anArray == ')' && last == '(' || anArray == ']' && last == '[')
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
