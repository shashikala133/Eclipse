package lab;
/** Positional Access*/ 
import java.util.*; 
public class ListDemo 
{
	public static void main(String[] args) 
	{
		// Creating a list 
		List<Integer> l1 = new ArrayList<Integer>(); 
		l1.add(0, 1); // adds 1 at 0 index 
		l1.add(1, 2); // adds 2 at 1 index 
		System.out.println(l1); // [1, 2] 
		List<Integer> l2 = new ArrayList<Integer>(); 
		l2.add(1); 
		l2.add(2); 
		l2.add(3); 
		l1.addAll(1, l2); 
		System.out.println(l1); 
		l1.remove(1); 
		System.out.println(l1); // [1, 2, 3, 2] 
		// Prints element at index 3 
		System.out.println(l1.get(3)); 
		// Replace 0th element with 5 
		l1.set(0, 5); 
		System.out.println(l1); 

		/** Search Operations*/ 
		// Type safe array list, stores only string 
		List<String> l = new ArrayList<String>(15); 
		l.add("NMAMIT"); 
		l.add("NITTE"); 
		l.add("UDUPI DISTRICT"); 
		System.out.println("first index of Geeks:" + l.indexOf("NMAMIT")); 
		System.out.println("last index of Geeks:" + l.lastIndexOf("UDUPI DISTRICT")); 
		System.out.println("Index of element" + " not present : " + l.indexOf("NET")); 
		/** subList Operations*/ 
		// Type safe array list, stores only string 
		List<String> l4 = new ArrayList<String>(5); 
		l4.add("NMAMIT"); 
		l4.add("NITTE"); 
		l4.add("UDUPI"); 
		l4.add("DISTRICT"); 
		l4.add("KARNATAKA"); 
		List<String> range = new ArrayList<String>(); 
		// Return List between 2nd(including) 
		// and 4th element(excluding) 
		range = l4.subList(2, 4); 
		System.out.println(range); 
	}
}