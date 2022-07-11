import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		long amount,deposit,balance;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount:");
		amount=sc.nextInt();
		deposit=350;
		if(amount>deposit)
		System.out.println("Insufficient balance!!");
		else {
		System.out.println("transaction is successsfull");
		balance=deposit-amount;
		System.out.println("Available balance:"+balance);

	}

	}
}

