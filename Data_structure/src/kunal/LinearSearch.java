package kunal;

public class LinearSearch {
	
	public static int search(int[] num,int target ) {
		for(int i=0;i<num.length;i++) {
			int element=target;
			if(num[i]==target) 
				return i;
			}
		return -1;
		
	}
	
	public static void main(String[] args) {
		//int[] num= {12,45,76,32,6,8};
		//int target=99;
//		int result=search(num,target);
//		if(result==-1) 
//			System.out.println("element is not found!!");
//		else
//			System.out.println("element is found at index "+result);
		String name="shashi";
		char target='m';
		System.out.println(searchchar(name,target));

	}
	static boolean searchchar(String str,char target) {
		if(str.length()==0)
			return false;
		else
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==target) {
					return true;
				}
			}
		return false;
		
	}
	

}
