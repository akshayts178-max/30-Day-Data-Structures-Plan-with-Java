package stack;

import java.util.Stack;

public class BalancedParenthses {
    private BalancedParenthses() {}

    // Check for balanced parentheses
    public static void checkBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Not balanced" + ch);
                    return;
                }

                char pop = stack.pop();
                if ((ch == ')' && pop != '(') ||
                        (ch == '}' && pop != '{') ||
                        (ch == ']' && pop != '[')) {
                    System.out.println("Not balanced" + ch);
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
