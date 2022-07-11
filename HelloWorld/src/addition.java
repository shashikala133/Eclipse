
public class addition {
	public int add(int a,int b) {
		a=100;
		int result=a+b;
		return result;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		addition ad=new addition();
		int a=10;
		int b=30;
		System.out.println("before calling"+a);
		int sum=ad.add(a, b);
		System.out.println("after calling"+a);
		System.out.println(sum);
		int sum1=ad.add(3, 8, 10);
		System.out.println(sum1);

	}

}
/*public class addition{
	public static void main(String[] args) {
		int[][] a={{2,6,4,8},{5,9,8,0}};
		System.out.println(a[1][0]);
		System.out.println(a[0].length);
	}
}*/


