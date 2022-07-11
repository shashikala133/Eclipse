class A{
	public static void show() {
		System.out.println("in A show");
	}
}
class B{
	public void add(int a,int b) {	
	int addition=a+b;
	int sub=a-b;
	int mul=a*b;
	
	   System.out.println("addition is:"+addition);
	   System.out.println("subtraction is:"+sub);
	   System.out.println("multiplication is:"+mul);
	}
}
public class Hello {

	public static void main(String[] args) {
		
		System.out.println("hello world!!!!");
        A.show();        B obj1=new B();
        obj1.add(143, 756);
        
        
        
	}

}
