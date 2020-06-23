package allbase;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {
 WebDriver dr;
	@BeforeClass
	public  void openBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shapl\\Documents\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.target.com/");
		String title=dr.getTitle();
		System.out.println("title is:"+" "+title);
		dr.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("dress");
		List<WebElement>ele=dr.findElements(By.xpath("//span[@class=\"TypeaheadItemText\"]"));
		int size=ele.size();
		System.out.println("size of list of webelements"+" "+size);
		for(int i=0;i<size;i++) {
			String text=ele.get(i).getText();
			System.out.println(text);
			if(text.contains("dress")) {
				ele.get(i).click();
			}
		}
		
		dr.manage().window().maximize();
		
		
	}

}
