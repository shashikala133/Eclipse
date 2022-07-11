package practice;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		/*PriorityQueue<Integer> que=new PriorityQueue<>();
        for(int i=10;i>0;i--) {
        	que.add(i);
        }
        System.out.println(que);
        System.out.println(que.peek());*/
		HashMap<String,Integer> map=new HashMap<>();
		map.put("abc", 10);
		map.put("mno", 20);
		map.put("xyz", 30);
		System.out.println(map);
		if(map.containsKey("xyz")) {
			Integer a=map.get("abc");
			System.out.println("value of abc "+a);
		}
	}

}
