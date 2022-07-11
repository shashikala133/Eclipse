package kunal;

public class Rec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //fun11(5);
		//System.out.println(fact(5));
		//System.out.println(sumofn(2));
		System.out.println(sumofdigits(3425));
	}
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	static void fun1(int n) {
		if(n==0) {
			return;
		}
		
		fun1(n-1);
		System.out.println(n);
	}
	
	static void fun11(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun11(n-1);
		System.out.println(n);
	}
	
	static int fact(int n) {
		if(n>=1) {
			return 1;
		}
		return n*fact(n-1);
	}
	static int sumofn(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumofn(n-1);
	}
	
	static int sumofdigits(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumofdigits(n/10);
	}

}
