package kunal;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-5,8,9,0,23};
		//bubble(arr);
		//selectionsort(arr);
		insertionsort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void insertionsort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
	}
  static void selectionsort(int arr[]) {
	  int n=arr.length;
	  for(int i=0;i<n;i++) {
		  int min_ind=i;
		  for(int j=i+1;j<n;j++) {
			 
			  if(arr[j]<arr[min_ind]) {
				  min_ind=j;  
			  }
			  
			  int temp=arr[min_ind];
			  arr[min_ind]=arr[i];
			  arr[i]=temp;
			  
		  
	  }
  }
  }
	
	
	static void bubble(int arr[]) {
		boolean swapped;
		swapped=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			
		}
			
		
	}

}
