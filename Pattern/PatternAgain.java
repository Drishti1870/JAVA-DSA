package Pattern;

public class PatternAgain {
    public void p1(){
        int row=4;
        int col=5;
        //outer loop
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //hollowrectangle
    public void hr(){
        int r=5,c=6;
        for(int i=1; i<=r;i++){
            for(int j=1; j<=c;j++){
                if(i==1||j==1||i==r||j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     public void hs(){
        int r=6;
       int  c=5;
            for(int i=1; i<=r;i++){
                for(int j=1;j<=c;j++){
                    if(i==1||j==1||i==r||j==c){
                        System.out.print(" *");
                    }else{
                        System.out.print("  ");//dpobuble space 
                    }
                }
                System.out.println();
            }
     }
     public void n1(){
        int r=5;
        for(int i=1; i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
     }
     public void n1reverse(){
//  1 2 3 4 5 
//  1 2 3 4
//  1 2 3
//  1 2
//  1
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
     }
     public void n2(){
        int r=5;
        int number =1;
        for(int i=1;i<=r; i++){
            for(int j=1; j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
     }
     public void n3(){
        int r=5; 
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
     }
     public void p2(){
        int r=5; 
        for(int i=1; i<=r;i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
     public void p3(){
        int r=5;
        for(int i=r; i>=1;i--){
            for(int j=1;j<=i;j++){
                    System.out.print("* ");

            }
            System.out.println();
        }
     }
     public void p4(){
        int  r=5;
        //outer loop
        for(int i=1; i<=r;i++){
            //space innner loop
            for(int space=1;space<=r-i;space++){
                System.out.print(" ");
            }
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

     }
     public void butterfly(){
        int r=4;
        //first half -1part
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(r-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2ndpart-upper 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lowwer half-1stpart
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(r-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2ndpart-lower 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
     }
    }
    public void reverserhombus(){
        int r=5;
        for(int i=r; i>=1;i--){
            //spaces
            for(int space=1; space<=r-i;space++){
                System.out.print(" ");
            }
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rhombus(){
        int r=5;
        for(int i=1; i<=r;i++){
            //spaces
            for(int space=1; space<=r-i;space++){
                System.out.print(" ");
            }
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printrow(){
        int n=5; 
        for(int i=1; i<n;i++){
            //spaces
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            //outer loop
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
               
            }
            System.out.println();
        }
    }
    public void p9(){
        int number =1; 
        int r=4;
        for(int i=1; i<= r; i++){
            for(int j=1; j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
    public void p10(){
        int n=5;
        //outer lop -leftside
        for(int i=1 ; i<=n;i++){
            //spaces
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j+" ");
            }
            //
        for(int j=2; j<=i;j++){
            System.out.print(j+"");
        }
        System.out.println();
    }}
    public void diamaond(){
        int r=5;
        for(int i=1; i<=r;i++){
            //spaces
            for(int s=1; s<=r-i;s++){
                System.out.print(" ");
            }
            //inner loop
            //star
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            //lower diamond
            for(int i=r; i>=1;i--){
                //spaces
                for(int s=1; s<=r-i;s++){
                    System.out.print(" ");
                }
                //inner loop
                //star
                for(int j=1; j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            
            }
    }
    public static void main(String[] args) {
        PatternAgain obj= new PatternAgain();
//     obj.p1();
//     obj.hr();
//     obj.hs();
//     obj.n1();
//     obj.n1reverse();
//     obj.n2();
//     obj.n3();
//     obj.p2();
//     obj.p3();
//     obj.p4();
//     obj.butterfly();
//     obj.rhombus();
//     obj.reverserhombus();
// obj.printrow();\
// obj.p9();
obj.p10();
// obj.diamaond();
    }
    
}
