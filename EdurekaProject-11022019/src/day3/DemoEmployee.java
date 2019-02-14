package day3;

public class DemoEmployee {

	public static void main(String[] args) {
	
		Employee saurabh = new Employee();
		
		saurabh.setSalary(40000);
		
		System.out.println(saurabh.getSalary());
		
		System.out.println(saurabh.calculateSalary());
		
		//-----------------------------------------------------
		
		Employee padmini = new Employee(50000, 5000);
		
		System.out.println(padmini.calculateSalary());

	}

}
