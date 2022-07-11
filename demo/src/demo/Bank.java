package demo;
import java.util.*;
public class Bank {
	String name;
	int accountNo;
	String type;
	int acbalance;
	int rate;
	static int n;
	static Bank b[]=new Bank[5];
	
	Bank() {
		System.out.println("welcome to bank of baroda");
	}
	Bank(String name,int accountNo,String type,int acbalance,int rate){
		this.name=name;
		this.accountNo=accountNo;
		this.type=type;
		this.acbalance=acbalance;
		this.rate=rate;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int accountNo;
		String type;
		int acbalance;
		int rate;
		System.out.println("enter no of employees");
		int n=sc.nextInt();
		new Bank();
		for(int i=0;i<n;i++) {
			System.out.println("enter the name:");
			name=sc.next();
			System.out.println("enter the account number:");
			accountNo=sc.nextInt();
			System.out.println("enter the type of account:");
			type=sc.next();
			System.out.println("enter the acbalance:");
			acbalance=sc.nextInt();
			System.out.println("enter the interest:");
			rate=sc.nextInt();
			b[i]=new Bank(name,accountNo,type,acbalance,rate);
		}
	for(int i=0;i<n;i++) {
		System.out.println(b[i].name+"\n"+b[i].accountNo+"\n"+b[i].type+"\n"+b[i].acbalance+"\n"+b[i].rate);
		
	}
	for(;;) {
		System.out.println("MENU");
		System.out.println("1.Deposit\n 2.withdraw\n 3.balance\n 4.exit");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter account number:");
			accountNo=sc.nextInt();
			System.out.println("enter the amount to deposit:");
			acbalance=sc.nextInt();
			deposit(accountNo,acbalance);
			break;
		case 2:
			System.out.println("enter account number:");
			accountNo=sc.nextInt();
			System.out.println("enter the amount to withdraw:");
			acbalance=sc.nextInt();
			withdraw(accountNo,acbalance);
			break;
		case 3:
			disp();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("invalid choice!!");
		}
	}
}
static void deposit(int accNo,int acbalance) {
		for(int i=0;i<n;i++) {
			if(accNo==b[i].accountNo) {
				b[i].acbalance+=acbalance;
				System.out.println("balance is:"+b[i].acbalance);
			}
			else {
				System.out.println("account not found!!");
			}
		}
	}
static void withdraw(int accNo,int acbalance) {
	for(int i=0;i<n;i++) {
		if(accNo==b[i].accountNo) {
			b[i].acbalance-=acbalance;
			System.out.println("balance is:"+b[i].acbalance);
		}
		else {
			System.out.println("account is not found!!");
		}
	}
}
static void disp() 
{ 
System.out.println("Acc_no \t Name \t balance \t Acc_Type \t Rate of Interest");
 
for(int i=0;i<n;i++) 
System.out.println(b[i].accountNo+ "\t"+b[i].name+ "\t"+b[i].acbalance+ "\t"+b[i].type + "\t"+b[i].rate); 

} 
}
