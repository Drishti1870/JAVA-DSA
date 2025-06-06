package Array;
import java.util.*;


public class Problem2 {


// for triplet sum
    static int  tripletSum(int arr[],int target){
        
        int n=arr.length;
        int ans=0;

        for(int i=0; i<n; i++){
           for(int j=i+1;j<n;j++){
               for(int k=j+1; k<n;k++){
                   if(arr[i]+arr[j]+arr[k]==target){
                       ans++;
                   }
               }
           }
        }
        return ans;

   }

   // for pairsum
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

//--------for unique number in array---------
static  int unique(int arr[]){
    int n = arr.length;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
    }
    int ans=-1;
    for(int i=0; i<n; i++){
        if(arr[i]>0){
            ans= arr[i];
        }
    }
    return ans;

}
//---------to find the maximum in array
static int findmax1(int arr[]){
    int n= arr.length;
    int max=arr[0];
    for(int i=0; i<n;i++){
        if(arr[i]>max){
            max= arr[i];

        }
           
        
    }
    return max;
}

//to finnd minimum in array---------------
static int findMin(int arr[]){
    int n= arr.length;
    int min=arr[0];
    for(int i=0; i<n;i++){
        if(arr[i]<min){
            min=arr[i];

        }
    }
    return min;

}

//==========to find min and max in array================//
static int findMinMax(int []arr){
    int n= arr.length;
    int min= arr[0];
 for(int i=0; i<n;i++){
        if(arr[i]<min){
            min= arr[i];

        }
    }
return min;
   
}
static int findmax(int arr[]){
    int n= arr.length;
    int max=arr[0];
    for(int i=0; i<n;i++){
        if(arr[i]>max){
            max= arr[i];

        }
           
        
    }
    return max;
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
        // System.out.println("Enter target sum value");
        // int target= sc.nextInt();

    //   System.out.println(tripletSum(arr, target));

    // System.out.println(PairSum(arr, target));

    //System.out.println(unique(arr));

    // int maximum= findmax(arr);
    // System.out.println("Maximum no. in array is" +maximum);

    // System.out.println(findMin(arr));
    
int maxm=findmax(arr);
System.out.println("Maximun"+maxm);
int min=findMin(arr);
System.out.println("Minimum" +min);



    }
   
     

    
}
