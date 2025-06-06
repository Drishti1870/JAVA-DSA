package Array;
import java.util.*;

public class problems {
    static int PairSum(int arr[], int target){
        int n=arr.length;
        int ans=0;

        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }




    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int []arr= new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target sum value");
        int target= sc.nextInt();

        System.out.println(PairSum(arr,target));
    }
    
}
