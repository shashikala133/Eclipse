package Riya_bansal;

public class BinarySerach {

	public static void main(String[] args) {
		int [] a= {3,6,9,12,56,89};
		int x = 90;
		System.out.println(search(x,a));

	}

	private static int search(int x, int[] a) {
		// TODO Auto-generated method stub
		int l = 0;
		int r = a.length-1;
		
		while(l<=r) {
			int m = (l+r)/2;
			if(a[m]==x)
				return m;
			if(a[m]<x) {
				l = m+1;
			
			}
			else {
				r=m-1;
			}
		}
		return -1;	
	}
	
	

}
