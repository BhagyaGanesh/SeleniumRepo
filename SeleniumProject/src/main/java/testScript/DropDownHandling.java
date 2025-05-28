package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base{
	
	public void dropdown() {
		
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement select = driver.findElement(By.id("single-input-field"));
		Select sc = new Select(select);
		//sc.selectByVisibleText("Yellow");
		//sc.selectByValue("Green");
		sc.selectByIndex(1);
		
	}

	public static void main(String[] args) {
		
		DropDownHandling drop = new DropDownHandling();
		drop.browserInitialization();
		drop.dropdown();
		

	}

}
