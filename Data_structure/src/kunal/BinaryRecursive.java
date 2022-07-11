package kunal;

public class BinaryRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,7,9,15,67};
		int target=0;
		System.out.println(search(arr,target,0,arr.length-1));

	}
	static int search(int[] arr,int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(target==arr[m]) {
			return m;
		}
		else if(arr[m]<target) {
			return search(arr,target,m+1,e);
		}
		else {
			return search(arr,target,s,m-1);
		}
	}

}
