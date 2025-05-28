package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base{
	
	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement radio = driver.findElement(By.linkText("Radio Buttons Demo"));
		radio.click();
		WebElement male = driver.findElement(By.id("inlineRadio1"));
		male.click();
		WebElement show = driver.findElement(By.id("button-one"));
		show.click();
	
	}
	
	public void radio2() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio2 = driver.findElement(By.linkText("Radio Buttons Demo"));
		 if(radio2.isSelected()){
			 
			 System.out.println("Radio button is selected");
		 }
		 else {
			 System.out.println("Radio button is Not selected");
			 radio2.click();
			 
		 }
		
	}

	public static void main(String[] args) {
		RadioButton radiobutton = new RadioButton();
		radiobutton.browserInitialization();
		radiobutton.radioButton();
		

	}

}
