package popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		//click the submit button without entering any username or password
		driver.findElement(By.name("Submit")).click();
		
		//switch to the alert
		Alert al = driver.switchTo().alert();
		
		//get the alert message and print it..
		System.out.println(al.getText());
		
		//click on the ok button
		al.accept();
		
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
