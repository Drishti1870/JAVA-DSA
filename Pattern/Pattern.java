package Pattern;
import java.util.*;

public class Pattern {
    public void pattern1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row= sc.nextInt();
        System.out.println("Enter the Col.");
        int col= sc.nextInt();
        for(int i=0; i<=row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void pattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row= sc.nextInt();
        System.out.println("Enter the Col.");
        int col= sc.nextInt();


        for(int i=1; i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public void pattern3(){
       for(int r=1; r<=4;r++){
        for (int s =r; s<4;s++){
                System.out.print(" ");
        }
        for(int c=1;c<=r;c++){
            System.out.print(" *");
        }
        System.out.println();
       }
    }
    // * * * *
    // * * *
    // * *
    // *
    public void pattern4(){
        for(int r=4; r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public void pattern5(){
        for(int r=4; r>=1;r--){
            for(int s=4;s>=1;s--){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public void pattern6(){
        
        for (int r= 0; r<= 8-1; r++)  
        {  
        for (int s=0; s<=r; s++)  
        {  
        System.out.print(" ");  
        }  
        for (int c=0; c<=r-1-r; c++)  
        {  
        System.out.print(" *");  
        }  
        System.out.println(); 
    }
}
    
    public static void main(String[] args) {
        Pattern p1= new Pattern();
        //p1.pattern1();
        // p1.pattern2();
        //p1.pattern3();
        //p1.pattern4();
        p1.pattern5();
    }
    
}
