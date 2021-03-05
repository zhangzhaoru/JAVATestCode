package OOPTestCLass.Account_Customer;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Smith");
		System.out.println("Bank customer's number is: " + bank.getNumberOfCustomer());
		bank.getCustomer(0).setAccount(new Account(1001, 2000, 2.56));
		bank.getCustomer(0).disInfo4Customer();
	}
}
