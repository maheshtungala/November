package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//enter text selenium into google searchbox
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");

	}

}
