package allbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Registry extends Base{
	WebDriver dr;
	Registry(WebDriver dr){
		this.dr=dr;
		
	}
	@Test
	public registy registry() {
		openBrowser();
		dr.findElement(By.xpath("//a[@href=\"/gift-registry/\"]")).click();
		return new registy(dr);
		
	}

}
