package day11;

import org.testng.annotations.Test;

public class TestNgTesting2 {
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void verifyExpectedException() {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 16;
		arr[2] = 15;
		arr[3] = 14;
		arr[4] = 15;
		
		for(int i=0; i<=5; i++){
			System.out.println(arr[i]);
		}
		
	}
}
