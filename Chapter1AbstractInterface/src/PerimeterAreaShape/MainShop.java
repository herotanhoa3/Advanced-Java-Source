package Shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class MainShop {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> product = new ArrayList<Product>(5);
		ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>(5);
		String[] state = {"vua moi dat", "da thanh toan", "da nhan hang"};
		
		product.add(new Product("Apple", 10000));
		product.add(new Product("Orange", 20000));
		product.add(new Product("Banana", 30000));
		product.add(new Product("Cherry", 40000));
		product.add(new Product("Lemon", 50000));
		product.add(new Product("Pepsi", 60000));
		product.add(new Product("Mirinda", 70000));
		product.add(new Product("7 Up", 80000));
		product.add(new Product("Sting", 90000));
		product.add(new Product("C2", 100000));
		
		int chooseProduct = 0;
		int number = 0;
		String chooseContinue = "";
		do {
			System.out.println("List Product");
			System.out.println("STT\tProduct Name\tPrice");
			for (int i = 0; i < product.size(); i++)
				System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice());
			
			System.out.print("Choose Produt: ");
			chooseProduct = sc.nextInt();
			System.out.print("Input Number: ");
			number = sc.nextInt();
			orderDetail.add(new OrderDetail(number));
			
			sc.nextLine();
			System.out.println("Do you want to choose more? (y / n)");
			chooseContinue = sc.nextLine();
		} while (chooseContinue.compareTo("y") == 0);
		
		System.out.println("Do you have member card? (y / n)");
		String chooseMemberCard = sc.nextLine();
		
		if(chooseMemberCard.compareTo("y") == 0)
		{
			System.out.println("1/Order\n2/Order and Pay");
			int chooseOrder = sc.nextInt();
			sc.nextLine();
			
			if(chooseOrder == 1)
			{
				System.out.println("Please input Customer Information");
				System.out.print("Input Name: ");
				String name = sc.nextLine();
				System.out.println("Input Indentity Card Number: ");
				String indentityCardNumber = sc.nextLine();
				System.out.println("Input Phone Number: ");
				String phoneNumber = sc.nextLine();
				System.out.println("Input Email: ");
				String email = sc.nextLine();
				System.out.println("Input Address: ");
				String address = sc.nextLine();
				
				Customer customer = new Customer(address, email, indentityCardNumber, name, phoneNumber);
				
				System.out.println("Do you want to invoice? (y / n)");
				String chooseInvoice = sc.nextLine();
				
				if(chooseInvoice.compareTo("y") == 0)
				{
					Order order = new Order(true, new Date(), state[0]);
					
					System.out.println("---Customer Information---");
					System.out.println("Customer ID: " + customer.getName());
					System.out.println("Name: " + customer.getName());
					System.out.println("Indentity Card Number: " + customer.getIndentityCardNumber());
					System.out.println("Phone Number: " + customer.getPhoneNumber());
					System.out.println("Email: " + customer.getEmail());
					System.out.println("Address: " + customer.getAddress());
					
					System.out.println("---Order Information---");
					System.out.println("STT\tProduct Name\tPrice\t  Number  Total Product Price");
					for (int i = 0; i < orderDetail.size(); i++) {
						System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice() 
								+ "\t  " + orderDetail.get(i).getNumber() + "\t  " + orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice()));
					}
				
					System.out.println("Total\t\t\t\t\t  " + order.getTotalOrderPrice(orderDetail, product));
				}
				else
				{
					Order order = new Order(false, new Date(), state[0]);
					
					System.out.println("---Customer Information---");
					System.out.println("Customer ID: " + customer.getName());
					System.out.println("Name: " + customer.getName());
					System.out.println("Indentity Card Number: " + customer.getIndentityCardNumber());
					System.out.println("Phone Number: " + customer.getPhoneNumber());
					System.out.println("Email: " + customer.getEmail());
					System.out.println("Address: " + customer.getAddress());
					
					System.out.println("---Order Information---");
					System.out.println("STT\tProduct Name\tPrice\t  Number  Total Product Price");
					for (int i = 0; i < orderDetail.size(); i++) {
						System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice() 
								+ "\t  " + orderDetail.get(i).getNumber() + "\t  " + orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice()));
					}
				
					System.out.println("Total\t\t\t\t\t  " + order.getTotalOrderPrice(orderDetail, product));
				}
			}
			else if(chooseOrder == 2)
			{
				Customer customer = new Customer("611/60", "tranphamhaidang1912@gmail.com", "025494661", "Tran Pham Hai Dang", "01658261080", "123456");
				
				System.out.println("Do you want to invoice? (y / n)");
				String chooseInvoice = sc.nextLine();
				
				if(chooseInvoice.compareTo("y") == 0)
				{
					Order order = new Order(true, new Date(), state[0]);
					
					System.out.println("---Customer Information---");
					System.out.println("Customer ID: " + customer.getName());
					System.out.println("Name: " + customer.getName());
					System.out.println("Indentity Card Number: " + customer.getIndentityCardNumber());
					System.out.println("Phone Number: " + customer.getPhoneNumber());
					System.out.println("Email: " + customer.getEmail());
					System.out.println("Address: " + customer.getAddress());
					
					System.out.println("---Order Information---");
					System.out.println("STT\tProduct Name\tPrice\t  Number  Total Product Price");
					for (int i = 0; i < orderDetail.size(); i++) {
						System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice() 
								+ "\t  " + orderDetail.get(i).getNumber() + "\t  " + orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice()));
					}
				
					System.out.println("Total\t\t\t\t\t  " + order.getTotalOrderPrice(orderDetail, product));
					
					System.out.println("Choose Payments");
					System.out.println("1/ATM\n2/Credit");
					int choosePayment = sc.nextInt();
					
					ATM atm = new ATM();
					if(choosePayment == 1)
					{
						if(order.getTotalOrderPrice(orderDetail, product) < atm.getBalance())
							System.out.println("Payed!");
						else
							System.out.println("The balance is not enough to pay!");
					}
					else if(choosePayment == 2)
					{
						Credit credit = new Credit();
						if(credit.getExpirationDate() != null)
							System.out.println("Payed!");
						else
							System.out.println("The Expiration Date is over!");
					}
				}
				else
				{
					Order order = new Order(false, new Date(), state[0]);
					
					System.out.println("---Customer Information---");
					System.out.println("Customer ID: " + customer.getName());
					System.out.println("Name: " + customer.getName());
					System.out.println("Indentity Card Number: " + customer.getIndentityCardNumber());
					System.out.println("Phone Number: " + customer.getPhoneNumber());
					System.out.println("Email: " + customer.getEmail());
					System.out.println("Address: " + customer.getAddress());
					
					System.out.println("---Order Information---");
					System.out.println("STT\tProduct Name\tPrice\t  Number  Total Product Price");
					for (int i = 0; i < orderDetail.size(); i++) {
						System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice() 
								+ "\t  " + orderDetail.get(i).getNumber() + "\t  " + orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice()));
					}
				
					System.out.println("Total\t\t\t\t\t  " + order.getTotalOrderPrice(orderDetail, product));
					
					System.out.println("Choose Payments");
					System.out.println("1/ATM\n2/Credit");
					int choosePayment = sc.nextInt();
					
					ATM atm = new ATM();
					if(choosePayment == 1)
					{
						if(order.getTotalOrderPrice(orderDetail, product) < atm.getBalance())
							System.out.println("Payed!");
						else
							System.out.println("The balance is not enough to pay!");
					}
					else if(choosePayment == 2)
					{
						Credit credit = new Credit();
						if(credit.getExpirationDate() != null)
							System.out.println("Payed!");
						else
							System.out.println("The Expiration Date is over!");
					}
				}
			}		
		}	
	}	
}
