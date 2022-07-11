package kunal;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,34,56,78,90,123,234};
		int target=90;
		int res=search(arr,target);
		System.out.println(res);

	}
	public static int search(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
