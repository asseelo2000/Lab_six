import java.util.Scanner;

/**
 * Created by Asseel tarish on 11/03/20.
 */
public class TestArrayStack {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    ArrayStack<String> stack=new ArrayStack<>(5);
    for (int i = 0; i <6 ; i++) {
        System.out.printf("Enter a name ");
        stack.push(in.next());
        System.out.printf("Top:  "+stack.top()+"\t size = "+stack.size()+"\t");
    }
    while (!stack.isEmpy()){
        System.out.print(stack.pop()+"\t");
    }
}
}
