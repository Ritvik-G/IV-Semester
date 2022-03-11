import java.util.*;

class Customer{
	String name;
	int customer_id;
	final int account_number;
	private int balance;
	String mobile_no;
	private boolean isDefault = false;
	Customer(String s,int a,int b,int c,String d){
		name = new String(s);
		customer_id = a;
		account_number = b;
		balance = c;
		mobile_no = new String(d);
		isDefault = false;
	}
	public void displayCustomer(){
		System.out.println("The name of the customer is: " + name);
		System.out.println("The customer id is: " + customer_id);
		System.out.println("The account number is: " + account_number);
	}
	void withDraw(int amount){
		if(isDefault == false){
		balance = balance - amount;
		if(balance<0){
			System.out.println("Not a valid transaction");
			isDefault = true;
			}
			System.out.println("Customer Id: " + customer_id);
		System.out.println("Balance is: " + balance);
		}
		else{
			System.out.println("The given transaction can not be completed as the customer is default");
		}
	}
	void deposit(int amount){
		balance = balance + amount;
		if(balance>0){
			isDefault = false;
			}
	}	
	void checkBalance(){
		System.out.println("The current balance of the customer is: " + balance);
	}	
}

class Methods{
	ArrayList<Customer> al;
	Scanner sc;
	Scanner sc_Str;
	Methods(){
		al = new ArrayList<>();
		sc = new Scanner(System.in);
		sc_Str = new Scanner(System.in);
	}
	boolean check(int a){
		Iterator<Customer> it = al.iterator();
		while(it.hasNext()){
			Customer i = it.next();
			if(i.customer_id == a)
				return false;
		}
		return true;
	}
	void addCustomer(){
		System.out.println("Enter name of customer: ");
		String s = sc_Str.next();
		System.out.println("Enter customer id: ");
		int a = sc.nextInt();
		if(check(a) == false){
			System.out.println("Enter a valid customer Id");
			return;
		}
		System.out.println("Enter account number: ");
		int b = sc.nextInt();
		System.out.println("Enter opening balance: ");
		int c = sc.nextInt();
		if(c<0){
			System.out.println("Enter valid amount: ");
			return;
		}
		System.out.println("Enter the mobile number: ");
		String d = sc.next();
		Customer cu = new Customer(s,a,b,c,d);
		al.add(cu);
	}
	void withdrawal(){
		System.out.println("Enter the customer id: ");
		int a = sc.nextInt();
		int b = -1;
		Iterator<Customer> it = al.iterator();
		while(it.hasNext()){
			Customer i = it.next();
			if(i.customer_id == a){
				System.out.println("Enter amount to be withdrawn:");
				int d = sc.nextInt();
				i.withDraw(d);
				return ;	
			}
		}
		System.out.println("Wrong id");
		return;
	}
	void depositAmount(){
		System.out.println("Enter the customer ID: ");
		int a = sc.nextInt();
		int b = -1;
		Iterator<Customer> it = al.iterator();
		while(it.hasNext()){
			Customer i = it.next();
			if(i.customer_id == a){
				System.out.println("Enter the value to add: ");
				int c = sc.nextInt();
				i.deposit(c);
				i.checkBalance();
				return;
			}
		}
	}
	void changeNo(){
		System.out.println("Enter customer id");
		int a = sc.nextInt();
		Iterator<Customer> it = al.iterator();
		while(it.hasNext()){
			Customer i = it.next();
			if(i.customer_id == a){
				System.out.println("your current mobile no is: " + i.mobile_no);
				System.out.println("Enter your new mobile number: ");
				String d = sc.next();
				i.mobile_no = d;
				System.out.println("NEW MOBILE NO is: " + i.mobile_no);
				return;	
			}
		}
		
		
	}
	
	void displayAll(){
		Iterator<Customer> it = al.iterator();
		while(it.hasNext()){
			Customer i = it.next();
			i.displayCustomer();
		}
	}
	
	void finale(){
		while(true){
			System.out.println("Enter 1 to add new customer");
			System.out.println("Enter 2 to withdraw amount");
			System.out.println("Enter 3 to deposit");
			System.out.println("Enter 4 to change mobile number");
			System.out.println("Enter 5 to display all");
			System.out.println("Enter 6 to exit");
			System.out.print("Enter your choice: ");
		int a = sc.nextInt();
		if(a == 1){
			addCustomer();
		}
		if(a == 2){
			withdrawal();
		}
		if(a == 3){
			depositAmount();
		}
		if(a == 4){
			changeNo();
		}
		if(a==5){
			displayAll();
		}
		if(a == 6){
			System.out.println("Press 1 to exit");
			int b = sc.nextInt();
			if(b == 1){
				return;
			}
		}
		}
	}
}

public class Bank {
	public static void main(String[] args) {
		Methods M = new Methods();
		M.finale();
		
	}
}
