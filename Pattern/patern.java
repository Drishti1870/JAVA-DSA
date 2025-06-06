package Pattern;
import java.util.*;

public class patern {
    public void pattern11(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows");
      int row= sc.nextInt();
      System.out.println("Enter the Col.");
      int col= sc.nextInt();
      
      for(int i=0; i<=row;i++){
        for(int s=0;s<=row-i;s++){
          System.out.print(" ");
        }
          for(int j=0;j<=row;j++){
              System.out.print(" *");
          }
          System.out.println();
      }
  }

  public void traianglePattern(){
    int row=5;
    for (int i=1; i<=row;i++){
      for(int k=1; k<=row-i;k++){
        System.out.print(" ");
      }
      for(int j=1; j<=2*i-1;j++){
        System.out.print("*");
    
    }
    System.out.println();
    }

  }
  public void hollowtrainagle(){
 int row=5;
  for (int i=1; i<= row;i++) {
    for(int s=1;s<=row-i;s++){
      System.out.print(" ");
    }
  
     for( int j=1; j<=2*i-1;j++){
      if(i==1||i==row ||j==1||j==2*i-1){
        System.out.print("*");
      }
      System.out.print(" ");
     }
     System.out.println();
    }
  }

  public void lowertriangle(){
    int n=6;
    for (int r=1; r<=n;r++){
      for(int s=1;s<r;s++){
        System.out.print(" ");
      }
      for(int c=0; c<=n-r-1;c++){
        if(r==1|| r==n ||c==1||c==2*(n-r)-2){
            System.out.print("* ");
        }else{
          System.out.print(" ");
        }
        // System.out.print("* ");
      }
      System.out.println();

  }}

   public void p7(){
     int n=5;
    for(int row=1;row<=n;row++){
      for(int spaces=0; spaces<=n-row;spaces++){
          System.out.print("  ");
      }
      for(int col=row;col>=1;col--){
          System.out.print(col+" ");
      }
      for(int col=2;col<=row;col++){
          System.out.print(col+" ");
      }
      System.out.println();
  }
}
   
  
  
  
  

  
    public static void main(String[] args) {
        patern obj= new patern();
        // obj.pattern11();
        //obj.traianglePattern();
        //obj.hollowtrainagle();
       // obj.hollowlowertriangle();
      //  obj.lowertriangle();
      obj.p7();
    }
    
}
