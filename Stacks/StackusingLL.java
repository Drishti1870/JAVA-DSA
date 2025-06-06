package Stacks;
import java.util.*;
public class StackusingLL {
        static class Node {
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
            
        }
        static class Stack{
            static Node head=null;

            public static boolean isEmpty(){
                return head==null;

            }
            //push
            public static void push(int data){
                Node newNode= new Node(data);
                if(isEmpty()){
                    head=newNode;
                    return;
                }
                newNode.next=head;
                head= newNode;
            }
            //pop
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head= head.next;
                return top;
            }
            //peek
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }

    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.push(6);
        s1.push(8);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }

    
}
