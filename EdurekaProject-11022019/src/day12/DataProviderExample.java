package day12;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "getTestData")
	public void printParameters(String username, String password, int employeeId) {
		System.out.println("Username : " + username);

		System.out.println("Password : " + password);

		System.out.println("EmployeeId : " + employeeId);

		System.out.println("-------------------------------------------------");
	}

	@DataProvider
	public Object[][] getTestData() {

		Object[][] data = new Object[3][3];

		data[0][0] = "Saurabh";
		data[0][1] = "xyz@123";
		data[0][2] = 23423;

		data[1][0] = "Rahul";
		data[1][1] = "abc@123";
		data[1][2] = 3423;

		data[2][0] = "Chandra";
		data[2][1] = "xyz@3547";
		data[2][2] = 457834;
		
		return data;
	}

}
