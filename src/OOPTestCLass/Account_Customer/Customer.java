package OOPTestCLass.Account_Customer;

/**
 * 
 * @Description 客户
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月5日下午12:42:33
 *
 */
public class Customer extends Account{
	private String firstName;
	private String lastName;
	private Account account;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, Account account) {
		super(account.getId(), account.getBalance(),account.getAnnuallnterestRate());
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void disInfo4Customer() {
		String info = "Customer ["+firstName+","+lastName+"] has a account"
				+ ": id is "+super.getId()+", annuallnterestRate is "
				+ super.getAnnuallnterestRate()+" % ,balance is: "
				+ super.getBalance()+"\n";
		System.out.println(info);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}
	
	
}
