package practice;

public class StudentInfo {
	final static String CONSTANT_VALUE="edureka";
	int rollno;
	String name;
	char grade;
	StudentInfo(int rollno,String name,char grade){
		this.rollno=rollno;
		this.name=name;
		this.grade=grade;
		
	}
	StudentInfo(){
		this(23,"meghan",'A');//chain link
	}
 public static void main(String[] args) {
	 
	 StudentInfo s1=new StudentInfo(12,"shashi",'A');
	 System.out.println(s1.name);
	 StudentInfo s2=new StudentInfo();
	 System.out.println(s2.name);
	 int no=300;
	 switch(no) {
	 case 100:
		 System.out.println("100 is executed");
	     break;
	 case 200:
		 System.out.println("200 is executed");
		 break;
     default:
    	 System.out.println("neither 100 nor 200 is executed");
    	 
	 }
 }
}
