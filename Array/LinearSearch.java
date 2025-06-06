package Array;

public class LinearSearch {
    static  int  linearSearch(int[] num, int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] num={2,4,5,6,7,8,9,22,11,4,10};
        int key=9;
        int index=linearSearch(num,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index " + index);
        }
    }
}
