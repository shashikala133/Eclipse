package practice;
import java.util.*;
class life {
    public static void palindrome(String S,char[] a){
        char start=0;
        char end=(char) (S.length()-1);
        while(start<=end){
          
            if(a[start]==a[end]){
                start++;
                end--;
                
            }
             
        }
        System.out.println("YES");  
    }
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     char [] a=new char[s.length()];
     for(int i=0;i<s.length();i++){
         a[i]=s.charAt(i);
     }
    palindrome(s,a);

    }
}

