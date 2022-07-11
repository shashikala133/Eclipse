package co.data;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> hash=new HashSet<String>();
		TreeSet<String>hash=new TreeSet<String>();
		//LinkedHashSet<String>hash=new LinkedHashSet<String>();
		hash.add("john");
		hash.add("jenny");
		hash.add("joe");
		hash.add("jack");
		hash.add("jim");
		hash.add("john");
		hash.add("john");
		System.out.println(hash);
		Iterator<String> itr=hash.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
		hash.remove("jim");
        System.out.println(hash);
        if(hash.contains("john"))
        	hash.add("shashi");
        System.out.println(hash);

	}

}
