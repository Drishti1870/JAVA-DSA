package Pattern;

public class pattern2 {
    public void p1(){
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1 ;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p2(){
        int n=4;
        for(int i=n;i>=1;i--){
            //spaces
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            //innner loop
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p3(){
        int n=4;
          //outer loop
          for(int i=1;i<=n;i++){
            //spaces
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1 ;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
    public void p4(){
       
            int n=4;
              //outer loop
              for(int i=n;i>=1;i--){
                //spaces
                for(int s=1; s<=n-i;s++){
                    System.out.print(" ");
                }
                for(int j=1 ;j<=2*i-1;j++){
                    if(j==1||j==2*i-1||i==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        
        
    }
    public static void main(String[] args) {
        pattern2 o= new pattern2();
        // o.p1();;
        // o.p2();
        o.p3();
        o.p4();
    }
}
