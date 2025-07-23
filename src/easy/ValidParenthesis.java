package easy;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValidParenthesis(s));
    }

    private static boolean isValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if ((stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}') || (stack.peek() == '(' && c == ')')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
