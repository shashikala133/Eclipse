package test;
public class gfg_sort {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8};
		int n=a.length;
		int res=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]+1==a[i+1])
				continue;
			else
				res=a[i]+1;
	}
		System.out.println(res);
}
}