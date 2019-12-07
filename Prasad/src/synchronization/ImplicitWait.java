package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//login
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		
		//verify the page title
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("TC1_VerifyLogin passed!");
		}else {
			System.out.println("TC1_VerifyLogin Failed!");
		}
		
		//click the logout link
		driver.findElement(By.linkText("Logout")).click();
		
		//close the browser
		driver.close();


	}

}
