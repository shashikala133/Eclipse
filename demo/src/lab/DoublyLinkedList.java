package lab;
import java.util.*;
class DLL<T>
{
	LinkedList<T> dll=new LinkedList<T>();
	void addfront(T num)
	{
		dll.addFirst(num);
	}
	void addback(T num)
	{
		dll.addLast(num);
	}
	void search(T key)
	{
		System.out.println(dll.contains(key)?"It is present":"It is not present");
	}
	void pri()
	{
			System.out.println(dll);
	}
}

class lab15
{
	public static void main(String args[])
	{
		DLL<Integer> d1=new DLL<Integer>();
		d1.addfront(10);
		d1.addfront(20);
		d1.addfront(30);
		d1.addback(100);
		d1.pri();
		d1.search(20);


	}
}