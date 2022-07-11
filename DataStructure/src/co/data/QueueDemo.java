package co.data;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
		//queue.add(3);
		//queue.add(7);
		//queue.add(10);
		//queue.add(5);
		//System.out.println(queue);
		for(int i=10;i>0;i--) {
			queue.add(i);
			//System.out.println(queue);
		}
		System.out.println(queue.peek());
		System.out.println(queue.poll());

	}

}
