package Arrayss;
public class basicProblem {

   
    void sumOfArr(){
        int arr[]={1,2,3,4};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        System.out.println("Add of Arrays :" + sum);

    }

    public static void main(String[] args) {
        basicProblem obj=new basicProblem();
        obj.sumOfArr();
    }
}

 