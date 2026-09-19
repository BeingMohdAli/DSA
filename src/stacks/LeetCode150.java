package stacks;

import javax.swing.text.html.HTMLDocument;
import java.util.Objects;
import java.util.Stack;

public class LeetCode150 {
    static void main() {
      String[]  tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(reversePolishedNotation(tokens));

    }
    public static int reversePolishedNotation(String[] arr){
        Stack<String> s1 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals("+")||arr[i].equals("/")||arr[i].equals("*")||arr[i].equals("-")){
               String pop1 = s1.pop();
               String pop2 = s1.pop();
               if(arr[i].equals("+")){
                   int i1 = Integer.parseInt(pop1) + Integer.parseInt(pop2);
                   s1.push(i1+"");

               } else if (arr[i].equals("-")) {
                   int i1 =   Integer.parseInt(pop2) - Integer.parseInt(pop1);
                   s1.push(i1+"");
               }
               else if (arr[i].equals("*")) {
                   int i1 = Integer.parseInt(pop1) * Integer.parseInt(pop2);
                   s1.push(i1+"");
               }else{
                   int i1 = Integer.parseInt(pop2)/ Integer.parseInt(pop1) ;
                   s1.push(i1+"");
               }

           }else{
               s1.push(arr[i]);
           }
        }
return Integer.parseInt(s1.peek());
    }
}
