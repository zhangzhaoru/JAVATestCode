package OOPTestCLass.Account_Customer;

public class CustomerAccountTest {
	public static void main(String[] args) {
		Account account = new Account(1000, 2000, 1.23);
		Customer customer = new Customer("Jane", "Smith", account);
		customer.disInfo4Customer();
		customer.deposit(100);
		customer.withdraw(960);
		customer.withdraw(2000);
	}
}
