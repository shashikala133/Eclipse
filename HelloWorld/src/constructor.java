
class studentinfo {
	int rollno;
	String name;

public void display(int rollno,String name){
	
	System.out.println(rollno+" "+name);
}
}
public class constructor {

	public static void main(String[] args) {
		
     studentinfo s1=new studentinfo();
     studentinfo s2=new studentinfo();
     s1.display(4758,"shashikala");
     s2.display(4984,"sahana");
	}

}

