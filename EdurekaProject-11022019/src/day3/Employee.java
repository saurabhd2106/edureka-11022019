package day3;

public class Employee {

	private int salary;

	private int bonus;

	public Employee() {
		salary = 90000;

		bonus = 10000;
	}
	
	public void setSalary(int salary){
		if(salary>0){
		this.salary = salary;
		} else {
			System.err.println("Invalid Salary");
		}
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary(){
		return salary;
	}

	public Employee(int salary, int bonus) {
		setSalary(salary);

		this.bonus = bonus;
	}

	int calculateSalary() {
		int totalSalary;

		totalSalary = salary + bonus;

		return totalSalary;
	}

}
