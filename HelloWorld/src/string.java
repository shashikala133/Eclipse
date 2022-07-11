
public class string {

	public static void main(String[] args) {
		String s1="Happy";
		System.out.println("string before concatenation:"+s1);
		s1=s1.concat("learning");
		System.out.println("string after concatenation:"+s1);
		String s="edureka";
		System.out.println(s.length());
		System.out.println(s.substring(2));
		String m="edureka";
		String n="edureka";
		System.out.println(m.compareTo(n));
		String h1="uyut";
		System.out.println(h1.isEmpty());
		String kk="shashi";
		System.out.println(kk.toUpperCase());
		String kl="SHASHIKALA";
		System.out.println(kl.toLowerCase());
		int a=50;
		String ss=String.valueOf(a);
		System.out.println(ss);
		String d="helld";
		String replace=d.replace('d','o');
		System.out.println(replace);
		String x="hellohii";
		System.out.println(x.charAt(5));
		System.out.println(x.endsWith("u"));
		StringBuffer f=new StringBuffer("welcome to edureka");
		f.append(" happy learning");
		System.out.println(f);
		f.insert(0, '@');
		System.out.println(f);
		f.replace(0, 2, "WeL");
		System.out.println(f);
		System.out.println(f.reverse());
		System.out.println(f.capacity());
		f.delete(0, 2);
		System.out.println(f);
		
		
	}

}
