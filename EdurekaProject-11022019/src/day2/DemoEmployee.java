package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaration of variable
		Employee saurabh;
		
		//Instantiation (allocates memory) and Initialization (sets default value)
		saurabh = new Employee();
		
		saurabh.salary= 800000;
		
		saurabh.bonus= 9000;
		
		saurabh.calculateSalary();
		
		//-------------------------------------------------------------
		
		System.out.println("------------------------------------------------------");
		
		Employee padmini = new Employee();
		
		padmini.salary  = 90000;
		
		padmini.bonus = 8000;
		
		padmini.calculateSalary();
		
		System.out.println("------------------------------------------------------");
		
		Employee aaron = new Employee();
		
		aaron.salary = 700000;
		
		aaron.bonus = 10000;
		
		int aaraonSalary = aaron.calculateSalary1();
		
		System.out.println("Salary of Aaron is : "+ aaraonSalary);
		
		System.out.println("------------------------------------------------------");
		
		Employee varun = new Employee();
		
		varun.salary = 800000; varun.bonus = 9000;
		
		int varunSalary = varun.calculateSalary3(600000, 50000);
		
		System.out.println("Salary of varun : "+varunSalary);

	}

}
