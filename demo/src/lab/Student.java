package lab;
import java.io.*;
class Student
{
 String usn, name, branch;
 long ph;
 
 Student()
 {
 usn = name = branch = "no value";
 ph = 0;
 }
 
 void read_data(String u, String n, String b, long p)
 {
 usn = u;
 name = n;
 branch = b;
 ph =p;
 }void display()
 {
 System.out.println(usn + "\t" + name + "\t" + branch + "\t\t" + ph);
 }
}
class Lab1A 
{
 public static void main(String args[]) throws Exception
 { 
 String u, n, b;
 long p;
 int no;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter number of records");
 no = Integer.parseInt(br.readLine());
 
 Student[] s = new Student[no];
 
 for(int i=0; i<s.length;i++)
 {
 System.out.println("Enter " + (i + 1) + " Student record");
 s[i] = new Student();
 System.out.println("Enter student USN");
 u = br.readLine();
 System.out.println("Enter student Name");
 n = br.readLine(); System.out.println("Enter student Branch");
 b = br.readLine();
 System.out.println("Enter student Phone number");
 p = Long.parseLong(br.readLine());
 s[i].read_data(u, n, b, p);
 }
 
 System.out.println("USN \t\t NAME \t BRANCH \t PHONE NO");
 for(int i=0; i<s.length;i++)
 {
 s[i].display();
 } 
 }
}

