package practice;

import java.util.*;



class TestClass {

  public static void minElement(int[] arr1,int[] arr2,int n){
    int res=0;
    boolean flag=true;
    while(Arrays.stream(arr1).min().getAsInt()>-1)
    {
      int a=Arrays.stream(arr1).min().getAsInt();
      for(int i=0;i<n;i++){
        if(arr1[i]!=a)
        {
          arr1[i]-=arr2[i];
          res+=1;
        }
      }
      HashSet<Integer> h1=new HashSet<>();
      for(int i=0;i<n;i++){
        h1.add(arr1[i]);
      }
      if(h1.size()==1)
         {
           flag=false;
           System.out.println(res);
           break;
         }
    }
    if(flag)
    {
       System.out.println(-1);
    }
        
  }
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr1=new int[n];
      int [] arr2=new int[n];
      for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        arr2[i]=sc.nextInt();
      }
      minElement(arr1,arr2,n);
      
    }}
