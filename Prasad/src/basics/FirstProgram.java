package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProgram {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.close();
	}

}
