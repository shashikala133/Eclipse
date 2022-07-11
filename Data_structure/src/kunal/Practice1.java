package kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		String message=greet("shashi");
		System.out.println(message);
		swap(10,20);
		String name="shashi";
		System.out.println(name);
		changed(name);
		//System.out.println(name);
		
		//IN JAVA THERE IS ONLY CALL BY VALUE NO CALL BY REFERENCE
		//primitive data types like String,int are follows call by value
		//objects,arr etc--> pass the value of referenced variable
		int arr[]= {1,5,3,87};
		changearr(arr);
		System.out.println(Arrays.toString(arr));

	}
  static void changearr(int[] num) {
		// TODO Auto-generated method stub
	  num[0]=99;
		
	}
static void changed(String name) {
		// TODO Auto-generated method stub
		name="manas";
		System.out.println(name);
		
	}
	static String greet(String name) {
		//Scanner sc=new Scanner(System.in);
		//String name=sc.next();
		String greeting="hello"+" "+name;
		return greeting;
	}
	
	static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a + " " + b);
	}
	//scope-->where we can access variable
	//if lets say variable a is already intialized then you cannot create one more
	// a within another block of same method but you can change the value at any time
	//it is valid only within a perticular block
	//anything initialized outside the block can be used inside the block,
	//anthing initialized inside the block cannot be used outside the block
	//anything initialized outside the block cannot be initialized inside one more time
	//but anthing initilized inside the block can be reinitialized outside the block
	
	

}
