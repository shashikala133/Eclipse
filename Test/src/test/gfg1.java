package test;



public class gfg1 {
	public static void reversedArray(int a[],int start,int end) {
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	public static void print(int a[]) {
		int size=a.length;
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		//System.out.println();	
		}
	}
	
	
	public static void main(String[] args) {
	int a[]= {2,5,0,7,9,0};
	reversedArray(a,0,5);
	print(a);
	
}
}
