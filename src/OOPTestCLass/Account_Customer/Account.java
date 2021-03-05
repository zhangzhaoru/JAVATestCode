package OOPTestCLass.Account_Customer;

/**
 * 
 * @Description 账户
 * @author ZhangZhaoRu
 * @version
 * @date 2021年3月5日下午12:37:56
 *
 */
public class Account {
	private int id;
	private double balance;
	private double annuallnterestRate;

	public Account() {
	}

	public Account(int id, double balance, double annuallnterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}

	/**
	 * 
	 * @Description 存钱
	 * @author shkstart
	 * @date 2021年3月5日下午1:36:00
	 * @param amount
	 */
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("余额不足，取款失败");
			return;
		}
		balance -= amount;
		System.out.println("取出成功： " + amount + " 账户余额： " + balance);
	}

	/**
	 * 
	 * @Description 取钱
	 * @author shkstart
	 * @date 2021年3月5日下午1:36:23
	 * @param amount
	 */
	public void deposit(double amount) {
		balance += amount;
		System.out.println("存入成功： " + amount + " 账户余额： " + balance);
	}
}
