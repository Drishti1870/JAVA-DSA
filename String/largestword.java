package String;
import java.util.*;

public class largestword {
     public  void lonestword(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str= sc.nextLine();
        System.out.println(str);
        String []words=str.split(" ");
        // System.out.println(words);

        String findlongWord= "";
        int max=0;
        for(String word:words){
            if(word.length()>findlongWord.length()){
                findlongWord=word;
            }
        }
        System.out.println("Largest word is :- "+ findlongWord);

     }

     public void evenlength(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str= sc.nextLine();
        System.out.println(str);
        String words[]=str.split(" ");

        String evenWords="";
        for(String word:words){
            if(word.length()%2==0){
                System.out.print(word);
            }else{
                System.out.println("No word found");
            }
        }
     }
    public static void main(String[] args) {
        largestword obj= new largestword();
        // obj.lonestword();
        obj.evenlength(); Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str= sc.nextLine();
        System.out.println(str);
    }
}
