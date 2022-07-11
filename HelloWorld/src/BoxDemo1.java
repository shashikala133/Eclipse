class Box{
	double width;
	double height;
	double depth;
	public void SetDim() {
		width='w';
		height='h';
		depth='d';
		
	}
	public void volume(double w,double h,double d) {
		double vol=w*h*d;
	    
	    System.out.println("volume:"+vol);
	}
	public void volume(double w,double d) {
		double vol=0.5*w*d;
		System.out.println("volume:"+vol);
	}
}
public class BoxDemo1 {

	public static void main(String[] args) {
		Box mybox=new Box();
		mybox.SetDim();
		mybox.volume(15, 10, 10);
		mybox.volume(10, 10);
		

	}

}
