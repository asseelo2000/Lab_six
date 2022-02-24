import java.util.Arrays;

/**
 * Created by user on 11/03/20.
 */
public class reverseArrayUsingStack {
    public static void main(String[] args) {
        int []a={11,22,33,44,55};
        System.out.printf("Before reverse: ");
        System.out.printf(Arrays.toString(a)+"\n");
        LinkedStack<Integer>s=new LinkedStack<>();
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }
        System.out.printf("After reverse: ");
        System.out.printf(Arrays.toString(a));
    }
}
