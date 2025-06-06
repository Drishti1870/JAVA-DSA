package basics;
import java.util.*;
public class swap {
    //to swap value without using third variable
    public static void main(String[] args) {
        //to take input from user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value of a");
        int a = sc.nextInt();
        System.out.println("Enter Second  value b");
        int b = sc.nextInt();
        //value before swapping
        System.out.println("Value Before Swapping A =" +a);
        System.out.println("Value Before Swapping B =" +b);
        //now the main part 
        b=b+a;
        a=b-a;//value swapped of b into a
        b=b-a;//vice versa
        System.out.println("Swapped Value of A =" +a);
        System.out.println("Swapped Value of B =" +b);
    }
}
