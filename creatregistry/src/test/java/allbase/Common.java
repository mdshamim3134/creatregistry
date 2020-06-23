package allbase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common extends Base {
	WebDriver dr;
	Common(WebDriver dr){
		this.dr=dr;
	}
	void getCommon(String common) {
		openBrowser();
		dr.findElement(By.xpath("//a[@class=\"Link-sc-1khjl8b-0 bTKAgl HeaderMainLink-sc-1tx0dwp-0 fdhNxU h-hidden-sm-down h-margin-l-tight\"]")).click();
		
		List<WebElement>ele=dr.findElements(By.xpath("//div[@class=\"Row-uds8za-0 iFzQdH\"]"));
		int size=ele.size();
		System.out.println("size of element is:"+size);
		//String keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for( WebElement e:ele) {
			
		String text=e.getText();
		if(text.contains(common)) {
			e.click();
		}
		
	}

}
	void getFather() {
		getCommon("Day");
		dr.navigate().back();
	}
	void getGrocery() {
		getCommon("Grocery");
		dr.navigate().back();
	}
	}
