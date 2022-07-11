class Car{
	public void move() {
		System.out.println("car moves");
	}
}
class bus extends Car{
	public void run() {
		System.out.println("bus also moves");
	}
}

public class vehicle{
	public static void main(String[] args) {
		Car a=new Car();
		a.move();
		bus b=new bus();
		b.run();
		b.move();
		
	}
}
