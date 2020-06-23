package allbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class registy extends Base{
	WebDriver dr;
	registy(WebDriver dr){
		this.dr=dr;
	}
	@Test
	public void registry() {
		dr.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("asma");
		dr.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("moni");
		dr.findElement(By.xpath("//div[@class=\"h-padding-r-default h-padding-l-default"
				+ " styles__ModifiedRegistryCol-hsogak-0 buddmF sc-gipzik cLDHGX sc-jAaTju dyGqHt\"]")).click();

	}

}
