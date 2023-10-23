package com.tester;
import java.util.Scanner;
import com.code.Account;
//import static java.lang.System.out;
public class BankAppliction {

	public static void main(String[] args) {
		Account[] Bank = new Account[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add details 	2.show 	3.get locker	 4.Deposite	 5.Withdraw 	6.Chnage duration 	7.exit");
		int ch, aid, lid, index = 0;
		do {
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < Bank.length) {
					System.out.println("Enter name, balance ");
					Account a1 = new Account(sc.next(), sc.nextDouble());
					Bank[index] = a1;
					index++;
					break;
				} else {
					System.out.println("Array is full");
				}
				break;
			case 2:
				for (Account aobj : Bank) {
					if (aobj != null) {
						System.out.println(aobj);
					} else {
						break;
					}
				}
				break;
			case 3:
				System.out.println("Enter your acid and duration : ");
				aid = sc.nextInt();
				int duration = sc.nextInt();
				for (Account act : Bank) {
					if (aid == act.getAccid()) {
						act.AssignLocker(duration);
						break;
					} else {
						System.out.println("Account not found...!");
					}
				}
				break;
			case 4:
				System.out.println("Enter your acid and amount : ");
				aid = sc.nextInt();
				for (Account act : Bank) {
					if (aid == act.getAccid()) {
						act.diposite(sc.nextInt());
						break;
					} else {
						System.out.println("Account not found...!");
					}
				}
				break;
			case 5:
				System.out.println("Enter your acid and amount : ");
				aid = sc.nextInt();
				for (Account act : Bank) {
					if (aid == act.getAccid()) {
						act.withdraw(sc.nextInt());
						break;
					} else {
						System.out.println("Account not found...!");
					}
				}
				break;
			case 6:
				System.out.println("Inter your id and Lockerid : ");
				aid = sc.nextInt();
				lid = sc.nextInt();
				for (int i = 0; i < Bank.length; i++) {
					if (Bank[i] != null) {
						if (Bank[i].getAccid() == aid) {
							if (Bank[i].getLockerId() == lid) {
								System.out.println("Enter duration : ");
								Bank[i].Changeduration(sc.nextInt());
							}
						}
					}
				}
			}
		} while (ch != 7);

	}

}
