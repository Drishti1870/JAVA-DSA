package Stack;

import java.util.Stack;

public class InsertStackElement {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1); //idx=0
        st.push(2); //idx=1
        st.push(3);//idx=2
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx=2;
        int x=8;
        Stack<Integer> temp= new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
