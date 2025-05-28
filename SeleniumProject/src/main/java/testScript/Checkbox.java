package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base{
	
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement checkbox = driver.findElement(By.linkText("Checkbox Demo"));
		checkbox.click();
		WebElement check = driver.findElement(By.id("gridCheck"));
		check.click();
	}
	
	public void checkBox2() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		
		if(checkbox.isSelected()) {
			
			System.out.println("Checkbox is selected");
			
		}
		else
		{
			checkbox.click();
		}
		
		
	}

	public static void main(String[] args) {
		Checkbox checkbox = new Checkbox();
		checkbox.browserInitialization();
		//checkbox.checkBox();
		checkbox.checkBox2();

	}

}
