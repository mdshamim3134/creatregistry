package allbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Deals extends Base {
	WebDriver dr;

	Deals(WebDriver dr) {
		this.dr = dr;
	}

	@Test
	public void deal() {
		openBrowser();
		dr.findElement(By.xpath(
				"class=\"Link-sc-1khjl8b-0 bTKAgl HeaderMainLink-sc-1tx0dwp-0 fdhNxU h-hidden-sm-down h-margin-l-wide\""))
				.click();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

}
