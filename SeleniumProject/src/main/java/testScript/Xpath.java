package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	
	
	public void relativeXpath() {
		//tag[@attribute='value']
		
		WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showmsg = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement gettotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement enterdate = driver.findElement(By.xpath("//input[@id='single-input-field2']"));
		WebElement stardown = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		
	}
	
	public void text() {
		//tag[text()='text']
		WebElement showmsg = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement entermsg = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement stardown = driver.findElement(By.xpath("//button[text()='Start Download']"));
		WebElement showdate = driver.findElement(By.xpath("//button[text()='Show Date']"));
		WebElement autoclose = driver.findElement(By.xpath("//button[text()='Autoclosable success']"));
	
		
	}
	
	public void contains() {
		 //tag[contains(@attribute,'value')]
		WebElement entermsg = driver.findElement(By.xpath("//input[contains(@id,'single-input-')]"));
		WebElement enterval = driver.findElement(By.xpath("//input[contains(@id,'value-')]"));
		
	}
	
	public void startsWith() {
		//tag[starts-with(@attribute,'value')]
		
		WebElement entermsg = driver.findElement(By.xpath("//input[starts-with(@id,'single-input-')]"));
		WebElement enterval = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		
	}
	
	public void and() {
		//tag[@attribute='value' and @attribute='value']
		
		WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		WebElement enterval = driver.findElement(By.xpath("//input[@class='form-control datepicker' and @type='text']"));
	}
	
	public void or() {
		//tag[@attribute='value' or @attribute='value']
		
		WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field' or @class='form-control']"));
		WebElement enterval = driver.findElement(By.xpath("//input[@class='form-control datepicker' or @type='text']"));
		
	}
	
	

	public static void main(String[] args) {
		

	}

}
