package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void id() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//WebElement elementname = driver.findElement(By.locator("locatorvalue"));--syntax
		WebElement element = driver.findElement(By.id("single-input-field"));
		element.sendKeys("Hey");
		WebElement showmsg = driver.findElement(By.id("button-one"));
		showmsg.click();
		
	}
	
	public void className() {
		WebElement element = driver.findElement(By.className("form-control"));
		WebElement element1 = driver.findElement(By.className("form-control datepicker"));
		WebElement element2 = driver.findElement(By.className("card-header"));
		WebElement element3 = driver.findElement(By.className("btn btn-primary"));
		WebElement element4 = driver.findElement(By.className("form-control filter"));
		
		
	}
	
    public void name() {
    	WebElement element = driver.findElement(By.name("viewport"));
    	WebElement element1 = driver.findElement(By.name("description"));
    	WebElement element2 = driver.findElement(By.name("keywords"));
    	WebElement element3 = driver.findElement(By.name("author"));
    	
	}
    
    public void linkText() {
    	WebElement ajaxform = driver.findElement(By.linkText("Radio Buttons Demo"));
    	WebElement element = driver.findElement(By.linkText("Jquery Select2"));
    	WebElement element1 = driver.findElement(By.linkText("Form Submit"));
    	WebElement element2 = driver.findElement(By.linkText("Select Input"));
    	WebElement element3 = driver.findElement(By.linkText("Checkbox Demo"));
	}
    
    public void partiallinkText() {
    	WebElement ajaxform = driver.findElement(By.partialLinkText("Radio Buttons"));
    	WebElement element = driver.findElement(By.partialLinkText("Jquery"));
    	WebElement element1 = driver.findElement(By.partialLinkText("Form"));
    	WebElement element2 = driver.findElement(By.partialLinkText("Select"));
    	WebElement element3 = driver.findElement(By.partialLinkText("Checkbox"));  
	
    }

	public static void main(String[] args) {
		Locators locators = new Locators();
		locators.browserInitialization();
		locators.id();
		

	}

}
