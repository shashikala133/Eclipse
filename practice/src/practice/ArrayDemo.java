package practice;
import java.util.ArrayList;
import java.util.Iterator;
class student{
	int rollno;
	String name;
}
public class ArrayDemo {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
        ArrayList list2=new ArrayList();
        student s1=new student();
       
        list1.add("john");
        list1.add("joe");
        list1.add("jim");
        list2.add("jim");
        list2.add(10);
        list2.add('A');
        list2.add("harry");
        list2.add(s1);
        System.out.println(list1);
        System.out.println(list2);
        for(String str:list1) {
        	System.out.println(str);
        }
        String name=list1.get(1);
        System.out.println("name is:"+name);
        Object o=list2.get(1);
        System.out.println(o);
        if(list1.contains("john")){
        	System.out.println("john is in the list");
        }
        for(int i=0;i<list2.size();i++) {
        	System.out.println(list2.get(i));
        }
        Iterator<String> itr=list1.iterator();
        //System.out.println(itr.next());
        while(itr.hasNext()) {
        	String str=itr.next();
        	System.out.println(str);
        }
        
	}

}
