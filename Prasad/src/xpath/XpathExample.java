package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("file:///D:/Mahesh/Downloads/QAPlanet.html");
        
        //get the innertext of the 2nd row 2nd col of the table
     /*   String text = driver.findElement(By.xpath
        		("//html/body/table/tbody/tr[2]/td[2]")).getText(); */
        
     //   String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
     /*   String text = driver.findElement(By.xpath
        		("//table[@id='Table1']/tbody/tr[2]/td[2]")).getText(); */
        
        String text = driver.findElement(By.xpath
        		("//*[@id='Table1']/tbody/tr[2]/td[2]")).getText();
        
        System.out.println(text);
        driver.close();
	}

}
