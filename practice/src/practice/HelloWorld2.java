package practice;

public class HelloWorld2 {
	static Integer instantvariable=10;
	Integer instantvariable1=30;
	int[] a= {2,4,1,4,5};
	int[] b=new int[5];
	
	public void hii(String name) {
		System.out.println("hii"+name);
	}
	public static void nonStatic() {
		System.out.println("i'm non static");
	}
	public int add(int arg1,int arg2) {
		
		return arg1+arg2;
	}
public static void main(String[] args) {
int [][] multidimensionalarray= {
			
			{1,2},
			{3,4}
	};
    String str1="edureka";
    str1="new";
    System.out.println(str1);
    String str2=str1.concat("techie");
    System.out.println(str2);
    System.out.println(str1.toUpperCase());
    System.out.println(str1.compareTo(str2));
    int d=50;
    System.out.println(String.valueOf(d));
    String s2="hello";
    System.out.println(s2.replace('e', 'a'));
	System.out.println("hello");
	StringBuffer s3=new StringBuffer("happy learning");
	System.out.println(s3);
	s3=s3.append("edureka");
	System.out.println(s3.reverse());
	HelloWorld2 h=new HelloWorld2();
	instantvariable=20;
	HelloWorld2 h1=new HelloWorld2();
	h1.instantvariable1=40;
	h.hii("shashi");
	nonStatic();
	HelloWorld2 a=new HelloWorld2();
	int result=a.add(20, 30);
	System.out.println(result);
	System.out.println(multidimensionalarray[0].length);
}
}
