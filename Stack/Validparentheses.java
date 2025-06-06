package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Validparentheses {
    //now we will create the function along with logic to implement this...
    public static boolean isBalanced(String str){
        Stack<Character> st= new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            //here we going through the single element in given input
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{ //ch==')'
                if(st.size()==0)return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0)return  false;
        else return true;
    }
    public static void main(String[] args) {
        //we have taken the input here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input here ");
        String str= sc.nextLine();
        //here we should call our function
        System.out.println(isBalanced(str));
    }
}
