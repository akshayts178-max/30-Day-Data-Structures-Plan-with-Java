package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    private NextGreaterElement() {}

    // Next greater element for each array element
    public static void findNextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(arr[i]);
        }

        System.out.println("Next greater elements: " + Arrays.toString(result));
    }
}
