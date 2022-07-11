package practice;
 class vehi{
   int no_of_wheels;
   String wheel="vehicles moves because of wheel";
   public void move11() {
	   System.out.println("mov in vehicle class");
   }
	
}
  class car22 extends vehi{
	
	String wheel="car has 4 wheels";
	@Override
	public void move11() {
		System.out.println("mov in vehicle class");	
		 System.out.println(wheel);
		 System.out.println(super.wheel);
	}
}
  class man{
	  public void pay() {
		  System.out.println("paying bill");
	  }
  }
  class millionare extends man{
	  public void pay() {
		  System.out.println("millionare is paying bill and giving tip too");
	  }
  }
public class AutomobileManagement {
	public void area(int h,int b) {
		System.out.println("area of triangle is"+(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("area of circle is"+(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    car22 bmw=new  car22();
    bmw.no_of_wheels=4;
    bmw.move11();
   
    vehi v=bmw;//we can assign subclass into superclass
    System.out.println(bmw.no_of_wheels);
    AutomobileManagement a=new AutomobileManagement();
    a.area(5,5);
    a.area(5);
    man obj=new millionare();
    obj.pay();
	}

}
