package org.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Edgedriver.Driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\msedgedriver.exe");
		
		WebDriver dd = new EdgeDriver();
		
		dd.get("https://demoqa.com/select-menu");
		
		WebElement drop = dd.findElement(By.id("cars"));
		
		Select rr = new Select(drop);
		
		//selecting multiple options in dropdown
		
//		rr.selectByIndex(0);
//		rr.selectByValue("opel");
//		rr.selectByVisibleText("saab");
//		
		//selecting all options
		
		List<WebElement> options = rr.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			rr.selectByIndex(i);
			
		}

		
	}

}
