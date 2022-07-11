package Riya_bansal;

public class SquareRoot {

	public static void main(String[] args) {
		int x=14;
		System.out.println(bsquare(x));
		

	}

	private static float bsquare(int x) {
		// TODO Auto-generated method stub
		
		int start = 0;
		double ans = 0;
		int end = x;
		while(start<=end) {
			int mid = (start+end)/2;
			if(mid*mid==x) {
				ans =  mid;
				break;
			}
			 if(mid*mid < x) {
				 start=mid+1;
				 ans=mid;
				
				
				
			}
			else {
				
				end = mid-1;
				//ans=mid;
				
			}
			
		}
		return (float) ans;
	}

	
	

}
