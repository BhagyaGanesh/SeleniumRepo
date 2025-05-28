package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{
	        
			
			
			
	
	public void tagAndId() {
		//1.Tag and ID(tag#id)
		
		WebElement showmsg = driver.findElement(By.cssSelector("button#button-one"));
		WebElement gettotal = driver.findElement(By.cssSelector("button#button-two"));
		WebElement auto = driver.findElement(By.cssSelector("button#autoclosable-btn-success"));
		WebElement normal = driver.findElement(By.cssSelector("button#normal-btn-success"));
		WebElement warning = driver.findElement(By.cssSelector("button#autoclosable-btn-warning"));
		
	}
	
	public void tagAndClass() {
		//2.Tag and class(tag.class)
		
		WebElement entermsg = driver.findElement(By.cssSelector("input.form-control"));
		  
	}
	
	public void tagAndAttribute() {
		//3.Tag and Attribute(tag[attribute=value])
		
		WebElement showmsg = driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement normal = driver.findElement(By.cssSelector("button[id='normal-btn-success']"));
		WebElement autowar = driver.findElement(By.cssSelector("button[id='autoclosable-btn-warning']"));
		WebElement normalwar = driver.findElement(By.cssSelector("button[id='normal-btn-warning']"));
		WebElement autodang = driver.findElement(By.cssSelector("button[id='autoclosable-btn-danger']"));
		
	}
	
	public void tagClassAndAttribute() {
		//4.Tag,class,and Attribute(tag.classname[attribute=value]
		
		WebElement entermsg = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		WebElement entervalue = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement enterval = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		WebElement date1 = driver.findElement(By.cssSelector("input.form-control datepicker[id='single-input-field']"));
		WebElement date2 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field2']"));
		
		
	}
	
	

	public static void main(String[] args) {
		

	}

}
