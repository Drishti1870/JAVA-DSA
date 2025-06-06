package Queue;

public class LLImplementation {
    public  static  class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static  class queueLL{
            Node head= null;
            Node tail = null;
            int size=0;

            public void add(int x){
                Node temp= new Node(x);

                if(size==0){
                    head= tail=temp;
                }else{
                    tail.next=temp;
                    tail = temp;

                }
                size++;
            }
            public int peek(){
                if(size==0){
                    System.out.println("Queue Is empty "); return -1;
                }
                return head.val;
            }
            public int remove(){
                if(size==0){
                    System.out.println("Queue Is empty "); return -1;
                }
                 int x= head.val;
                head= head.next;
                size--;
                return  x;
            }
            public void display(){
                if(size==0){
                    System.out.println("Queue Is empty ");
                        return;
                }
                Node temp=head;
                while (temp!=null){
                    System.out.print(temp.val+" ");
                    temp= temp.next;

                }
                System.out.println();
            }
            public boolean isEmpty(){
                if(size==0)return true;
                else return false;
            }
        }

    public static void main(String[] args) {
            queueLL q1= new queueLL();
            q1.display();
            q1.add(5);
            q1.add(8);
            q1.add(9);
            q1.add(10);
            q1.add(12);
            q1.display();
        System.out.print(q1.peek());
        q1.remove();
        System.out.println();
        q1.display();
        System.out.println(q1.isEmpty());
    }
}
