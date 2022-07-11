package co.data;
import java.util.*;
class Student{
	int rollno;
	String name;
	
}
public class ListDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="mike";
		s1.rollno=100;
		ArrayList<String>list1=new ArrayList<String>();
		ArrayList list2=new ArrayList();
		list1.add("john");
		list1.add("jenny");
		list1.add("jim");
		list1.add("jack");
		list1.add("john");
		list2.add(2);
		list2.add("john");
		list2.add(2.2);
		list2.add(s1);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(s1.name);
       
		String name=list1.get(3);
		System.out.println(name);
		list1.set(2,"shashi");
		System.out.println(list1);
		Object o=list2.get(2);
		System.out.println("o is"+o);
		list1.remove(2);
		System.out.println(list1);
		if(list1.contains("john"))
			System.out.println("john is in the list");
		//ArrayList.sort(list1);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("itereting through iterator");
		 Iterator itr=list1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 //if(str.equals("jack"))
				 //itr.remove();
		 }
	
		 //System.out.println(itr.next());
		 //System.out.println(itr.next());
	}

}
