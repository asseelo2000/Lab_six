import java.util.Scanner;

/**
 * Created by Asseel tarish on 11/03/20.
 */
public class TestStack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedStack<String> stack=new LinkedStack<>();
        for (int i = 0; i <5 ; i++) {
            System.out.printf("Enter a name ");
            stack.push(in.next());
            System.out.printf("Top:  "+stack.top()+"\t size = "+stack.size()+"\t");
        }
        while (!stack.isEmpy()){
            System.out.print(stack.pop()+"\t");
        }
    }
}
