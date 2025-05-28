package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends Base{
	
	public void actionMethod() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		//actions.dragAndDrop(drag, drop).build().perform();
		actions.contextClick(drag).build().perform();
		//actions.moveToElement(drag).build().perform();
		//actions.doubleClick(drag).build().perform();
		//actions.click(drag).build().perform();
		
	}

	public static void main(String[] args) {
		Action action = new Action();
		action.browserInitialization();
		action.actionMethod();

	}

}
