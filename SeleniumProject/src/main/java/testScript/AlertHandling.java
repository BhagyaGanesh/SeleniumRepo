package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void simple() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simple1.click();
		driver.switchTo().alert().accept();
		
		
	}
	
	public void confirmation() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirm1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirm1.click();
		driver.switchTo().alert().dismiss();
		
	}
	
	public void prompt() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt1 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt1.click();
		driver.switchTo().alert().sendKeys("Name");
		
	}

	public static void main(String[] args) {
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.browserInitialization();
		//alerthandling.simple();
		//alerthandling.confirmation();
		alerthandling.prompt();

	}

}
