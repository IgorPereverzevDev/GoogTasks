import java.util.Stack;

/**
 * Created by zorg9 on 15.12.2017.
 */
public class Parentheses {
    static int solution(String str) {
        if (str.isEmpty()) {
            return 1;
        }
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();
        for (char anArray : array) {
                if (anArray == '(' || anArray == '{' || anArray == '[') {
                    stack.push(anArray);
                }
                if (anArray == '}' || anArray == ')' || anArray == ']') {
                    if (stack.empty()) {
                        return 0;
                    }
                    char last = stack.peek();
                    if (anArray == '}' && last == '{' || anArray == ')' && last == '(' || anArray == ']' && last == '[') {
                        stack.pop();
                    } else {
                        return 0;
                    }
                }
            }
        if(!stack.empty()){
            return 0;
        }
        return 1;
    }


    public static void main(String[] args) {
        var str = "(()(())())";
        System.out.println(solution(str));
    }

}
