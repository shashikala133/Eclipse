class Akshatha{
	String nickname="akku";
	String relation="bestie";
	String status="COMMITTED!!!";
	public void display() {
	System.out.println("nickname:"+nickname);
	System.out.println("relation:"+relation);
	System.out.println("status:"+status);
	}
}
class Pallavi{
	String nickname="Pallu";
	String relation="best friend";
	String status=" NOT COMMITTED,AS FAR AS I KNOW!!!";
	public void display() {
	System.out.println("nickname:"+nickname);
	System.out.println("relation:"+relation);
	System.out.println("status:"+status);
	}
	
}
public class Shashi {

	public static void main(String[] args) {
		Akshatha A=new Akshatha();
		A.display();
		Pallavi P=new Pallavi();
		P.display();
	}

}
