package day10.javaConcepts;

public class Employee {

	int employeeId;

	String employeeName;

	static String orgnanizationName;

	static int count;

	static {

		System.out.println("First thing to execute when this class loads");
		orgnanizationName = "QA Tech Hub";
		count = 1000;

	}

	public Employee(String employeeName) {
		this.employeeName = employeeName;

		employeeId = getEmployeeId();
	}

	static int getEmployeeId() {
		count = count + 1;

		return count;
	}

	public void printEmployeeInfo() {
		System.out.println("Employee Id :: " + employeeId);

		System.out.println("Employee Name :: " + employeeName);
		System.out.println("Organization :: " + orgnanizationName);

		System.out.println("-------------------------------------------");
	}

}
