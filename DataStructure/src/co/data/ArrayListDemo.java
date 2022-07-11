package co.data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
        al.add(23);
        al.add(39);
        al.add("welcome");
        al.add('A');
        System.out.println(al);
        System.out.println(al.size());
        //al.remove(2);
        al.remove("welcome");
        System.out.println(al);
		//ArrayList <Integer> al = new ArrayList<Integer>();
		//ArrayList<String> al = new ArrayList<String>();
		//List al = new ArrayList();
        //insert a new element
        al.add(2,46);
        System.out.println(al);
        System.out.println(al.get(2));
        al.set(3, 56
        		);
        System.out.println(al);
        System.out.println(al.contains("python"));
        //al.isEmpty() --> False
        //for loop,for each loop,iterator method
        System.out.println("reading elements using for loop");
        for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
        System.out.println("using for each loop");
        for(Object e : al) {
        	System.out.println(e);
        }
        System.out.println("using iterator");
        Iterator it = al.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        //sort ---> collections.sort-->also present inside util package
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        //shuffling
        Collections.shuffle(al);
        System.out.println(al);
        String arr[] = {"dog","elephant","cat"};
        for(String value:arr) {
        	System.out.println(value);
        }
        ArrayList al2 =new ArrayList(Arrays.asList(arr));
        System.out.println(al2);
	}

}
