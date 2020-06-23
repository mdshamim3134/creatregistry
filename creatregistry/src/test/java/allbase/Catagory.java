package allbase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Catagory extends Base {
	WebDriver dr;
	Catagory(WebDriver dr){
		this.dr=dr;
		
	}
	
	public void catagory() throws InterruptedException {
		openBrowser();
		dr.findElement(By.xpath("//a[@class=\"Link-sc-1khjl8b-0 bTKAgl HeaderMainLink-sc-1tx0dwp-0 fdhNxU h-hidden-sm-down h-margin-l-tight\"]")).click();
		
		List<WebElement>ele=dr.findElements(By.xpath("//div[@class=\"Row-uds8za-0 iFzQdH\"]"));
		Set<String>hs=new HashSet(ele);
		hs.add("asma");
		hs.add("anee");
		System.out.println(hs); 
		
	
		System.out.println(ele);
		int i=9;
		int size=ele.size();
		System.out.println("size of element is:"+size);
		String keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for( WebElement e:ele) {
			
		String text=e.getText();
		System.out.println("text:"+text);
		Thread.sleep(30000);
		e.sendKeys(keys);
		}
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	

}
