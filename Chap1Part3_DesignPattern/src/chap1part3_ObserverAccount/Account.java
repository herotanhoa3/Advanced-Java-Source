package chap1part3_ObserverAccount;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date: 1/9/2016
 */
public class Account {
	private List<Observer> observers = new ArrayList<>();
	private double state;
	public double getState() {
		return state;
	}
	public void setState(double state) {
		this.state = state;
	}
	//to add a Observer into list.
	public void attach(Observer observer){
		observers.add(observer);
	}
	//to print notify email and mobi sms.
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			System.out.println(observer.update());
		}
	}
}
