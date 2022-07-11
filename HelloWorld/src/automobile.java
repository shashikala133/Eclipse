import java.util.Scanner; 
 public class automobile 
 { 
 String name; 
int acno; 
 String actype; 
int balance; 
int rate; 
static int n; 
static automobile b[]=new automobile[5]; 
automobile() 
 { 
 System.out.println("Welcome to Bank"); 
 } 
 
 automobile(String name, int acno,String actype, int balance, int rate) 
 { 
 this.name=name; 
 this.acno=acno; 
 this.actype=actype; 
 this.balance=balance; 
 this.rate=rate; 
 } 
 
public static void main(String args[]) 
 { 
 String name; 
 int acno; 
 String actype; 
 int balance; 
 int rate; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the number of accounts you want to create"); 
  
 n=sc.nextInt(); 
 new automobile(); 
 for (int i=0;i<n;i++) 
 { 
 System.out.println("Enter the Name"); 
 name=sc.next(); 
 System.out.println("Enter the Account Number"); 
 acno=sc.nextInt(); 
 System.out.println("Enter the Account Type"); 
 actype=sc.next(); 
 System.out.println("Enter the Balance Amount"); 
 balance=sc.nextInt(); 
 System.out.println("Enter the Rate of Interest"); 
 rate=sc.nextInt(); 
 b[i]=new automobile(name,acno,actype,balance,rate); 
 } 
 for(int i=0;i<n;i++) 
 { 
 
 System.out.println(b[i].name+"\n"+b[i].acno+"\n"+b[i].actype
+"\n"+b[i]. balance+"\n"+b[i].rate); 
 } 
 for(;;) 
 { 
 System.out.println("Menu"); 
 System.out.println("1.Deposit\n 2.Withdraw\n 3.Display\n 4.Exit"); 
  
 int ch=sc.nextInt(); 
 switch(ch) 
 { 
 case 1: 
 System.out.println("Enter the Account Number and amount to deposit");
 acno=sc.nextInt();
 balance=sc.nextInt(); 
deposit(acno,balance); 
 break; 
 case 2: 
 System.out.println("Enter the Account Number and amount to withdraw");
  
 acno=sc.nextInt(); 
 balance=sc.nextInt(); 
withdraw(acno,balance); 
 break; 
 case 3:disp(); 
 break; 
 case 4: 
 System.exit(0); 
 break; 
 default:System.out.println("Invalid Choice"); 
 } 
 } 
 } 
static void deposit(int acno, int bal) 
 { 
 
 for(int i=0;i<n;i++) 
 { 
 if(acno==b[i].acno) 
 { 
 b[i].balance+=bal; 
 System.out.println(b[i].balance); 
 } 
 else
 { 
 System.out.println("Not Found"); 
 } 
 } 
 
 } 
static void withdraw(int acno, int bal) 
 { 
 
 for(int i=0;i<n;i++) 
 { 
 if(acno==b[i].acno) 
 { 
 b[i].balance-=bal; 
 System.out.println(b[i].balance); 
 } 
 else
 { 
 System.out.println("Not Found"); 
 } 
 } 
 } 
static void disp() 
 { 
 System.out.println("Acc_no \t Name \t balance \t Acc_Type \t Rate of Interest");
  
 for(int i=0;i<n;i++) 
 System.out.println(b[i].acno+ "\t"+b[i].name+ "\t"+b[i].balance+ "\t"+b[i].actype + "\t"+b[i].rate); 
 
 } 
 }
