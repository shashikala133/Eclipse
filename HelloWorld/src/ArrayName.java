/*
public class ArrayName {

	public static void main(String[] args) {
		int[] arrayofinteger=new int[10];
		int[] array= {2,4,6,8,10};
		int[][] multidimensionalarray= {
				{1,3,8},
				{3,5},
				{5,8}
		};
		System.out.println(array[0]);
		System.out.println(array[2]);
		System.out.println(array[4]);
		System.out.println(multidimensionalarray[0].length);

	}

}
*/
import java.util.Scanner;


public class ArrayName {

	public static void main(String[] args) {
		int i;
		int name[]={'S','H','A','S','H','I','K','A','L','A';
		//String array[]=name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key:");
		int key=sc.nextInt();
		for(i=0;i<11;i++)
		{
			if(name[i]==key) {
			System.out.println("key found");
			}
				System.out.println("key not found");
			
		}
	}
}
		
		
		

	

