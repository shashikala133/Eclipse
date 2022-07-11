class StudentTest
{
	java.lang.String name;
	java.lang.String usn;
	int mse1,mse2,task;
	StudentTest()
	{
		name = "abhay";
		usn = "4nm19is001";
		mse1 = 18;
		mse2 = 19;
		task = 8;
		
	}
	StudentTest(java.lang.String n,java.lang.String u,int m1,int m2,int t){
		name = n;
		usn = u;
		mse1 = m1;
		mse2 = m2;
		task = t;
	}
	//copy constructor
	StudentTest(StudentTest s)
	{
		name = s.name;
		usn = s.usn;
		mse1 = s.mse1;
		mse2 = s.mse2;
		task = s.task;
	}
	void display()
	{
		System.out.println(name+ "\t" +usn +"\t"+ mse1+"\t"+mse2+"\t"+task);
	}
}

public class StudentConstructer {

	public static void main(String[] args) {
		StudentTest s1 = new StudentTest();
		StudentTest s2 = new StudentTest("sahana","4nm19is152",15,12,5);
		StudentTest s3 = new StudentTest(s1);
		s1.display();
		s2.display();
		s3.display();

	}

}
