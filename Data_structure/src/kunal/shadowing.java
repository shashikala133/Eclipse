package kunal;

public class shadowing {
    static int x=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		int x=40;
		System.out.println(x);
		fun();
		//System.out.println(x);
		

	}
	static void fun() {
		//int x=30;
		System.out.println(x);
	}

}
