package practice;
class employee{
	private String name;
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name=name;
   }
}
public class DemoEncaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     employee e1=new employee();
     e1.setName("shashi");
    System.out.println(e1.getName());
    try {
    	//System.out.println(12/0);
    	int[] a= {1,2,3};
    	System.out.println(a[3]);
    }
    catch(ArithmeticException exception) {
    	System.out.println("printing a kind of arithematic exception "+exception.getMessage());
    }
    catch(Exception e){
    	System.out.println("generic exception");
    }
    finally {
    	System.out.println("finally block under execution");
    }
	}

}
