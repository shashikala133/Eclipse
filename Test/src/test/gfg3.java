package test;

import java.util.*;
class Customer{
	String ID;
	String name;
	int CLimit;
	Customer(String ID,String name,int CLimit){
		this.ID=ID;
		this.name=name;
		this.CLimit=CLimit;
	}
}

public class gfg3 {
	public static void main(String[] args) {
		String ID;
		String name;
		int CLimit;
	Scanner sc=new Scanner(System.in);
	Customer[] c=new Customer[5];
	System.out.println("enter how many customers:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("enter customer id,name and climit");
		 ID=sc.next();
		 name=sc.next();
		 CLimit=sc.nextInt();
		 c[i]=new Customer(ID,name,CLimit);
	}
	System.out.println("Displaying");
	for(int i=0;i<n;i++) {
		System.out.println(c[i].ID+"\t"+c[i].name+"\t"+c[i].CLimit);
	}
	
}
}