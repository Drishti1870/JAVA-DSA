package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=1;i<=n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println("Original stack is: " +st);
//        System.out.println(st.peek());
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        //for the copied stack
        Stack<Integer> ct= new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.println("copied stack is: " +ct);
    }
}
