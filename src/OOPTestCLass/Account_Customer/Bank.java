package OOPTestCLass.Account_Customer;

import java.util.Currency;

/**
 * 
* @Description 银行
* @author ZhangZhaoRu
* @version
* @date 2021年3月5日下午3:10:22
*
 */
public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	public Bank() {
		super();
		customers = new Customer[200];
	}
	
	public Customer getCustomer(int index) {
		if(index>=0&&index<numberOfCustomer) {
			return customers[index];
		}else {
			return null;
		}
	}

	public int getNumberOfCustomer() {
		return numberOfCustomer;
	}

	public void addCustomer(String f,String l) {
		Customer customer = new Customer();
		customer.setFirstName(f);
		customer.setLastName(l);
		customers[numberOfCustomer] = customer;
		numberOfCustomer++;
	}
	
	
}
