// program of armstrong number 
package basics;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        // to take input
        int n, arm=0, rem, c; 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
c=n;
//lets make its logic
 while(n>0){
    rem=n%10;
    arm=(rem*rem*rem)+arm;
    n=n/10;
 }
 if(c==arm){
    System.out.println(" It is Armstrong Number");
 }else{
    System.out.println("Not Armstrong Number");
 }

        
    }
}
