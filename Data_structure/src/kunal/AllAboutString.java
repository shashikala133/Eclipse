package kunal;

import java.util.ArrayList;
import java.util.Arrays;

public class AllAboutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="kunal";
		String b="kunal";
		System.out.println(a==b);
		a="rahul";
		System.out.println(a==b);
		String c=new String("kunal");
		String d=new String("kunal");
		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println('a'+'b');
		System.out.println("a"+"b");
		System.out.println('a'+3);
		System.out.println("a"+1);
		System.out.println("A"+'a');
		System.out.println("shashi"+new ArrayList<>());
		System.out.println("shashi"+new Integer(56));
		//System.out.println(new Integer(56)+new ArrayList<>());-->error
		System.out.println(new Integer(56)+""+new ArrayList<>());//atlest one string must be there
		prettyPrinter();
		//performance();
		sb();
		

	}
	static void prettyPrinter() {
    	//System.out.printf("my name is %s and i'm %s","shashi","cool");
		//float num=34.2334f;
		//System.out.printf("value of num = %.3f",num);
		//System.out.printf("value of pi is %.4f",Math.PI);
		System.out.println(Math.PI);
	}
	static void sb() {
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
			
			}
		System.out.println(builder.toString());
		builder.reverse();
		System.out.println(builder);
		String name="SHASHI KALA";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name);//original one will remain same-->immutable
		System.out.println(Arrays.toString(name.split(" ")));
	}
	
	static void performance() {
		String series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			System.out.println(ch);
			series=series+ch;
		}
		System.out.println(series);//waste of lots of memory-->ab,abc,abcd,abcde..O(n^2)
		//new object is created each time-->use stringbuilder
		
	}

}
