package day5;

public class DemoGuru99 {

	public static void main(String[] args) {

		Guru99Project guru = new Guru99Project();

		guru.invokeBrowser();

		guru.login("mngr178621", "byhAsYq");

		guru.addCustomer();

		String customerId = guru.getCustomerId();

		System.out.println("Customer Id : " + customerId);
		
		guru.addAccount(customerId);
	}

}
