package String;

public class palindrome {
    public static boolean isPalindrome(String str){
        String rev="";
        boolean ans= false;
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            ans =true;

        }
        return ans;
    }
   
        
        public static void main(String[] args)
        {
           
            String str = "ababa";
    
            
            str = str.toLowerCase();
            boolean A = isPalindrome(str);
            System.out.println(A);
        }
    }