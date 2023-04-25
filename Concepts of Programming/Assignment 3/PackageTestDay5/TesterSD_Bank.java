package com_D5.PackageTestDay5;
import com_D5.Day5.SD_Bank;
import java.util.Scanner;
public class TesterSD_Bank {

	public static void main(String[] args) {

		//		SD_Bank p1 = new SD_Bank();
		//		p1.displayInfo();

		Scanner sc = new Scanner(System.in);
		int choice;

		SD_Bank act1 = null;
		SD_Bank act2 = null;

		do {
			System.out.println("1.Create Account \n2.Show Account \n3.Deposit Money \n4.Withdraw Money \n5.Money Transfer \n6.Update Name \n7.Update Email \n8.Update City \n9.View Balance \n10.Exit");		
			choice = sc.nextInt();
			boolean flag = false;
			switch(choice){
			case 1:
				System.out.println("1.act1Id 2.Name 3.City 4.Email 5.Balance");
				act1 = new SD_Bank (sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
				System.out.println("1.act1Id 2.Name 3.City 4.Email 5.Balance");
				act2 = new SD_Bank (sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
				System.out.println("Account Created Successfully\n");
				break;
			case 2:
				act1.displayInfo();
				act2.displayInfo();
				break;
			case 3:
				System.out.println("Enter the amount to deposit");
				act1.depositMoney(sc.nextDouble());
				System.out.println("Balance = "+act1.getBalance());
				System.out.println("Enter the amount to deposit");
				act2.depositMoney(sc.nextDouble());
				System.out.println("Balance = "+act2.getBalance());
				break;
			case 4:
				System.out.println("Enter the amount to withdraw");
				act1.withdrawMoney(sc.nextDouble());
				System.out.println("Balance = "+act1.getBalance());
				System.out.println("Enter the amount to withdraw");
				act2.withdrawMoney(sc.nextDouble());
				System.out.println("Balance = "+act2.getBalance());
				break;
			case 5:
				System.out.println("Enter your ActID: ");
				int id = sc.nextInt();
				System.out.println("Enter the amount to be transferred: ");
				int amount = sc.nextInt();
				if(id == act1.getActid()) {
					if(act1.getBalance()<amount)
					{
						System.out.println("Insufficient balance");
					}
					else
					{
						act1.moneyTransfer(act2, amount);
					}
				}
				if(id == act2.getActid()) {
					if(act2.getBalance()<amount)
					{
						System.out.println("Insufficient balance");
					}
					else
					{
						act2.moneyTransfer(act1, amount);
					}
				}
				break;
			case 6:
				System.out.println("Enter Your Name to be updated");
				act1.setName(sc.nextLine());
				act1.setName(sc.nextLine());
				System.out.println("Updated Name: "+act1.getName());
				System.out.println("Enter Your Name to be updated");
				act2.setName(sc.nextLine());
				act2.setName(sc.nextLine());
				System.out.println("Updated Name: "+act2.getName());
				break;
			case 7:
				System.out.println("Enter Your Email to be updated");
				act1.setName(sc.nextLine());
				act1.setName(sc.nextLine());
				System.out.println("Updated Email: "+act1.getEmail());
				System.out.println("Enter Your Email to be updated");
				act2.setName(sc.nextLine());
				act2.setName(sc.nextLine());
				System.out.println("Updated Email: "+act2.getEmail());
				break;
			case 8:
				System.out.println("Enter Your City to be updated");
				act1.setName(sc.nextLine());
				act1.setName(sc.nextLine());
				System.out.println("Updated City: "+act1.getCity());
				System.out.println("Enter Your City to be updated");
				act2.setName(sc.nextLine());
				act2.setName(sc.nextLine());
				System.out.println("Updated City: "+act2.getCity());
				break;
			case 9:
				System.out.println("Current Balance Act1 = "+act1.getBalance());
				System.out.println("Current Balance Act2 = "+act2.getBalance());
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid Input");
			}
		}while(choice!=10);
	}

}
