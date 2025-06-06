package Array;

public class Maximumelement {
    public static void main(String[] args) {
        int arr[]={1,5,65,68,55};
        System.out.println(maxElement(arr));

    }
    public static int maxElement(int arr[]){
        int maxVal= arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}

// wap to print sum of array element  using recursion