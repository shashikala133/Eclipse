package co.data;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
	HashMap<String,Integer>map=new HashMap<>();	
    System.out.println(map);
    map.put("abc", 10);
    map.put("pqr", 20);
    map.put("xyz", 30);
    System.out.println("size of map is"+map.size());
    System.out.println(map);
    if(map.containsKey("abc"))
    {
    	Integer a=map.get("abc");
    	System.out.println("value of key \"abc\" is"+a);
    }
    System.out.println(map);
	}

}
