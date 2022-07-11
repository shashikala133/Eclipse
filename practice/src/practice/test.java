package practice;

import java.util.*;
class test {
    static boolean isprime(int n){
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static int isprimegreater(int num){
        while(isprime(num)){
            ++num;
        }
        return num;
    }
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     StringBuilder sb=new StringBuilder();
     String s=sc.nextLine();
     int l=s.length();
     for(int i=0;i<l;i++){
         char c=s.charAt(i);
         int ascii=(int)c;
         int n=isprimegreater(ascii);
         char a=(char)n;
         sb=sb.append(a);
        

     }
     System.out.println(sb);
      
    }
}

