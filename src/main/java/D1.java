import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D1 {
	WebDriver dr;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("https://www.franklintempleton.com/");
		dr.findElement(By.xpath("")).sendKeys("bag",Keys.ENTER);
	}

}

