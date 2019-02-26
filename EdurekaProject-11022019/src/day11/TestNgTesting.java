package day11;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTesting {
	
	
	@Test(priority=0)
	public void testcase1(){
		System.out.println("\t\t\t\t Executing test case 1");
	}
	
	@Test(priority=1000)
	public void testcase4(){
		System.out.println("\t\t\t\t Executing test case 4");
	}
	
	@Test(priority=-2000, enabled=true)
	public void testcase3(){
		System.out.println("\t\t\t\t Executing test case 3");
	}
	
	
	@Test(priority=3000)
	public void testcase6(){
		System.out.println("\t\t\t\t Executing test case 6");
	}
	
	@BeforeMethod
	public void beforeAMethod(){
		System.out.println("\t\t\t Executes before a test case");
	}
	
	@AfterMethod
	public void afterAMethod(){
		System.out.println("\t\t\t Executes after a test case");
	}
	
	@BeforeClass
	public void beforeAClassLoads(){
		System.out.println("\t\t First method to be executed when a class loads");
	}
	
	@AfterClass
	public void afterAClass(){
		System.out.println("\t\t Last method to be executed in a class");
	}

}
