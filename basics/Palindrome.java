package basics;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        
      
        int rem, sum=0, temp;
        int n=454;
        

        temp=n;//we kept the value of n in temp here

        //now the main logic
        while(n>0){
            rem=n%10;//getting remainder
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("It is Palindrome Number");
        }else{
            System.out.println("Not palindrome Number");
        }

        
    }
}
