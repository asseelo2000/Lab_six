package lab_six.Lab_six_assinment;

import java.util.Stack;

/**
 * Created by Asseel Alazazi on 24/2/2022.
 */

 // Java program to evaluate value of a postfix expression
public class R_6_35 {



    // Method to evaluate value of a postfix expression
        static int evaluatePostfix(String exp)
        {
            Stack<Integer> stack=new Stack<>();   //create a stack

            for(int i=0;i<exp.length();i++)       // Scan all characters one by one
            {
                char c=exp.charAt(i); // variable to store each character entered

                // If the scanned character is an operand (number here),
                // push it to the stack.
                if(Character.isDigit(c))
                stack.push(c - '0');//?

                    //  If the scanned character is an operator, pop two
                    // elements from stack apply the operator
                else
                {
                    int val1 = stack.pop();
                    int val2 = stack.pop();

                    switch(c)
                    {
                        case '+':
                            stack.push(val2+val1);
                            break;

                        case '-':
                            stack.push(val2- val1);
                            break;

                        case '/':
                            stack.push(val2/val1);
                            break;

                        case '*':
                            stack.push(val2*val1);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        // Driver program to test above functions
        public static void main(String[] args)
        {
            String exp="426*+2-";
            System.out.println("Expression in normal form is ((2*6)+4)-2");
            System.out.println("Postfix expression to evaluate is 426*+2-");
            System.out.println("postfix evaluation: "+evaluatePostfix(exp));
        }
    }


