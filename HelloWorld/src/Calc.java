import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first argument:");
		num1=sc.nextInt();
		System.out.println("enter second argument:");
		num2=sc.nextInt();
		num3=num1+num2;
		System.out.println("result is:"+num3);
	}

}
