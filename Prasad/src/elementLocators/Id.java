package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("https://www.facebook.com");
		
		//enter the email into the email-id textbox
		driver.findElement(By.id("email")).sendKeys("maheshtungala@gmail.com");
	}

}
