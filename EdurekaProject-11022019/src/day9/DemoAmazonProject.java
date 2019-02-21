package day9;

public class DemoAmazonProject {

	public static void main(String[] args) {
		
		AmazonProject amazon = new AmazonProject();
		
		amazon.invokeBrowser();
		
		String result = amazon.searchProduct("Apple watch", "Electronics");

		System.out.println("Result :: "+ result);
		
		String productInfo = amazon.getNthProduct(9);
		
		System.out.println(productInfo);
		
		amazon.printAllProductViaJsScrollDown();
	}

}
