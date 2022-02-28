package lab_six.Lab_six_assinment;

import java.util.Stack;

/**
 * Created by Asseel Alazazi on 24/2/2022.
 */
public class R_6_5 {
    public static Stack <Integer>popAllRecursive(Stack stack) {

        if(stack.isEmpty()) {
            //nothing to remove, return
            return null;
        }
        stack.pop();  // remove one stack element

        popAllRecursive(stack); // recursive invocation of your method

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
        System.out.println("Stack before popped:"+stack);
        System.out.println("Stack elements are popped:"+popAllRecursive(stack));

    }
}
