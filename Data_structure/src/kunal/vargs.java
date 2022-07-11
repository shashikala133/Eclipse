package kunal;

import java.util.Arrays;
import java.util.Scanner;

public class vargs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		arrgs(3,6,3,2,6,7,4,0);
		//in int arrays default value is zero
		//in string array default value is null
		//primitives datatypes such as int.float stored in stack
		//non primitive like string type,object stored in heap
		//multiple(2,5,"hii","hello");
		//System.out.println(isArmstrongNum(153));
		//System.out.println("true");
		//isSumIsEven();
		int arr[][]=new int[3][2];//row size is must
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		

	}
	static void arrgs(int...v) { //you can give any name(v,u,f,o),it creates an array of integer
		System.out.println(Arrays.toString(v));
	}
	static void multiple(int a,int b,String ...v) { //variable length argument always should come at 
		//the end
		System.out.println(Arrays.toString(v));
	}
	static boolean isArmstrongNum(int n) {
		int original=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int cube=rem*rem*rem;
			sum+=cube;
			n=n/10;
			
		}
		if(sum==original) {
			return true;
		}
			
	
	return false;
	}
	static void isSumIsEven() {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int value=sc.nextInt();
		while(value>0) {
			int rem=value%10;
			
			sum+=rem;
			value=value/10;
			
		}
		if (sum%2==0) {
		System.out.println("sum is even!!");
		
		}
		System.out.println("sum is odd!!!");
	}
}
