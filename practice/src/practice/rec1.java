package practice;

public class rec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //fun(5);
		funboth(5);
	}
	public static void fun(int n) {
		if(n==0)
			return;
		else {
			fun(n-1);
			System.out.println(n);
			
			
		}
	}
	public static void funboth(int n) {
		if(n==0)
			return;
		else {
			System.out.println(n);
			funboth(n-1);
			System.out.println(n);
		}
	}

}
