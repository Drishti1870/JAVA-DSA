package Array;
public class revisionarr {
    public static int LinearSearch(int arr[],int key){
        for(int i=0; i<=arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static int getlargest(int arr[]){
        int largest=arr[0];
        for(int i=0; i<=arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,10,44,65};
        // int key=10;
        // int index= LinearSearch(arr,key);
        // if(index==-1){
        //     System.out.println("Not found");
        // }else{
        //     System.out.println("found at index "+index);
        // }
System.out.println("get largest value is "+ getlargest(arr));
    }
}
