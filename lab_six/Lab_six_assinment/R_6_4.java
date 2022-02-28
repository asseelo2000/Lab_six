package lab_six.Lab_six_assinment;

import java.util.Stack;

/**
 * Created by Asseel Alazazi on 24/2/2022.
 */
public class R_6_4 {

    public static Stack trnsfare(Stack S1, Stack S2){
        for (int i = 0; i < 5; i++) {
            S1.push(i);
        }
        System.out.println("Stack S before popped to Stack T:"+S1+" Size= "+S1.size());
        while (!S1.isEmpty()){
            S2.push(S1.pop());
        }
        System.out.println("Stack S is popped to Stack T :"+"Size= "+ S1.size());
//        System.out.println("Stack T  :"+S2+"Size= "+S2.size());
        return S2;
    }

    public static void main(String[] args) {
        Stack <Integer> S=new Stack<>();
        Stack <Integer> T=new Stack<>();
        System.out.println(trnsfare(S,T));

    }
}
