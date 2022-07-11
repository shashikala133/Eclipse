package biodata;
interface schooling
{
	public static void numberOfCertificateCompleted()
	{
		System.out.println("he got 3 certificates");
	}
}
interface college{
	void print();
}
public class home implements schooling,college{
	public void print() {
		System.out.println("Student is good");
	}
}
package pack1;
import biodata.home;
public class Department 
{

	public static void main(String[] args)
         {
	
		home d=new home();
		d.print();
	}
}




