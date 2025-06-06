package Queues;
import java.util.*;

public class QueueusingJCF {
    public static void main(String[] args) {
       /* Queue<Integer> q= new LinkedList<>();*/
        //we cam use Linkedlist as well as ArrayDeque//
        Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
