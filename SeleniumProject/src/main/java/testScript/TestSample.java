package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base{
	
	public void addition() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement addition = driver.findElement(By.id("value-a"));
		addition.sendKeys("5");
		WebElement addition1 = driver.findElement(By.id("value-b"));
		addition1.sendKeys("2");
		WebElement sum = driver.findElement(By.id("button-two"));
		sum.click();
		
	}

	public static void main(String[] args) {
		TestSample testsample = new TestSample();
		testsample.browserInitialization();
		testsample.addition();

	}

}
