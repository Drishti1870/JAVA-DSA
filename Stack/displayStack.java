package Stack;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(8);
        st.push(9);
        //done by stack
        //print it without using directly sout(st)
//        Stack<Integer> rt= new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int x=rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }


        //done by array
        int n= st.size();
        int arr[]= new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
