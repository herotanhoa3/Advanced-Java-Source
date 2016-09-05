package chap1part3_ObserverAccount;

import java.util.Scanner;
/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		account.setState(10000000);
		@SuppressWarnings("unused")
		EmailObserver emailOb = new EmailObserver(account);
		@SuppressWarnings("unused")
		MobiObserver mobiOb = new MobiObserver(account);

		System.out.println("Input the amount you want to withdraw: ");
		double state = input.nextDouble();
		if (state > account.getState()) {
			System.out.println("This amount is greater than the amount in your account.");
		} else {
			account.setState((account.getState() - state));
			account.notifyAllObservers();
		}

	}

}
