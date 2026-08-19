package stack;

import java.util.Stack;

public class ReverseString {
    private ReverseString() {}

    // Reverse a string using a stack
    public static void reverseString(char[] str){
        Stack<Character> stack = new Stack<>();

        for (char ch : str){
            stack.push(ch);
        }

        for (int i = 0; i < str.length; i++){
            str[i] = stack.pop();
        }
        System.out.println(str);
    }
}
