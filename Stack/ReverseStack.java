package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1); //idx=0
        st.push(2); //idx=1
        st.push(3);//idx=2
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> gt= new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.print(gt);
        Stack<Integer> qt= new Stack<>();
        while (gt.size()>0){
            qt.push(gt.pop());
        }
        System.out.println(qt);
        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println("reversed " +st);
    }
}
