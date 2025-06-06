package Stacks;
import java.util.*;
public class StackusingFrame {
    
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>(); 
            s1.push(5);
            s1.push(6);
            s1.push(8);

            while(!s1.isEmpty()){
                System.out.println(s1.peek());
                s1.pop();
            }
    }
    
}
