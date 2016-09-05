package chap1part3_ObserverAccount;
/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class MobiObserver extends Observer{

	public MobiObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	//to print notify balance to customer.
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Mobi: Your account has changed. Account balance is " +account.getState();
	}
	
}
