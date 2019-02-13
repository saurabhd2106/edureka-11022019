package day2;

public class Employee {
	
	int salary;
	
	int bonus;
	
	public Employee() {
		System.out.println("I am a constructor");
		salary = 90000;
		bonus = 5000;
	}
	
	void calculateSalary(){
		int totalSalary = salary + bonus;
		
		System.out.println("Salary of employee : "+ totalSalary);
	}
	
	int calculateSalary1(){
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}

	int calculateSalary2(int sal, int bon){
		int totalSalary = sal + bon;
		
		return totalSalary;
	}

	int calculateSalary3(int salary, int bonus){
		int totalSalary = this.salary + this.bonus;
		
		return totalSalary;
	}
}
