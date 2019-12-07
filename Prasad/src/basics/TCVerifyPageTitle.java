package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TCVerifyPageTitle {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//declare the expected  title
	/*	String expTitle = "Google";
		
		//fetch the actual title
		String actTitle = driver.getTitle();
		
		
		//compare them both
		if(actTitle.equals(expTitle)) {   */
		
		if(driver.getTitle().equals("Google")) {
			System.out.println("TC passed!");
		}else {
			System.out.println("TC failed!");
		}
		
		//close the browser
		driver.close();

	}

}
