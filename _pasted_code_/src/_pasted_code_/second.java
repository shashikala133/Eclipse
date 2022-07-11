package _pasted_code_;
class computer{
	public static computer getComputer() {
		return new laptop();
	}
	public void show() {
	
}
class laptop extends computer{
	public void show() {
		System.out.println("in laptop,you can carry me");
	}
}
class desktop extends computer{
	public void show() {
		System.out.println("in desktop,you can't carry me");
	}
}
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    computer obj=computer.getComputer();
    obj.show();
	}
}
}
