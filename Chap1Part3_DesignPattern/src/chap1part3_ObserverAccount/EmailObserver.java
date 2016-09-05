package chap1part3_ObserverAccount;
/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class EmailObserver extends Observer{

	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	//to notify balance to customer.
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Email: Your account has changed. Account balance is " +account.getState();
	}
	
}
