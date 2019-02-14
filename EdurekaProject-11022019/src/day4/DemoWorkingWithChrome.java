package day4;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		wc.navigateCommands();
		
		System.out.println(wc.getTitle());
		
		wc.closeBrowser();
	}

}
