package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	
	public void multipleWindowHandling() {
		
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);//parent window handle
		System.out.println("****************************");
		Set<String> childhandle = driver.getWindowHandles();
		for(String set:childhandle) {
			System.out.println("window handle"+ set);
			driver.switchTo().window(set);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("****************************");
		}
	}

	public static void main(String[] args) {
		
		MultipleWindowHandling windowhandle = new MultipleWindowHandling();
		windowhandle.browserInitialization();
		windowhandle.multipleWindowHandling();
	}

}
