package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void tablePrinting() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(element.getText());
		
	}
	
	public void row() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(element.getText());
		WebElement element1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(element1.getText());
		WebElement element2 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]"));
		System.out.println(element2.getText());
	}
	
	public void cell() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
		System.out.println(element.getText());
		WebElement element1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[1]"));
		System.out.println(element1.getText());
		WebElement element2 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[6]/td[2]"));
		System.out.println(element2.getText());
				
		
	}
	
	public void column() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> element = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		
		for(WebElement list:element) {
			
			System.out.println(list.getText());
			
		}
		
	}

	public static void main(String[] args) {
		TableHandling table = new TableHandling();
		table.browserInitialization();
		//table.tablePrinting();
		//table.row();
		//table.cell();
		table.column();

	}

}
