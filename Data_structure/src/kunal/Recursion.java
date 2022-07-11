package kunal;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //message();
		//printnumber(1);
		int ans=fibonacci(7);
		System.out.println(ans);
      
	}
//	static void message() {
//		System.out.println("hello world!");
//		message1();
//}
//	static void message1() {
//		System.out.println("hello world!");
//		message2();
//	}
//	static void message2() {
//		System.out.println("hello world!");
//		message3();
//	}
//	static void message3() {
//		System.out.println("hello world!");
//	}
	
	static int fibonacci(int n) {
		if(n<2) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	static void printnumber(int n) {
		if(n==5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printnumber(n+1);
		
	}
	

	

}
