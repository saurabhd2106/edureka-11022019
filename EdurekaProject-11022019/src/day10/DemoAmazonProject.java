package day10;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonLinkProject amazon = new AmazonLinkProject();
		
		amazon.invokeBrowser();
		
		int linkCount = amazon.getLinkCount();
		
		System.out.println("Link count :: "+ linkCount);
		
		amazon.printLinkUrl();
		
		amazon.printAllLinks();

	}

}
