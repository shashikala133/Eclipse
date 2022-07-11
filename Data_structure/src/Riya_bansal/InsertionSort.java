package Riya_bansal;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,11,3,2,5};
		sort(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

	private static void sort(int[] arr, int length) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1] = key;
			
		}
		
	}

	

}
