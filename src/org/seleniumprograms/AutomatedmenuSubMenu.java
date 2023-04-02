package org.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomatedmenuSubMenu {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Edgedriver.Driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\msedgedriver.exe");
		
		WebDriver as = new EdgeDriver();
		
		as.get("https://www.oyorooms.com/");
		
		as.manage().window().maximize();
		
		WebElement pl = as.findElement(By.xpath("//h2[text()='Chennai']"));
		
		Actions ac = new Actions(as);
		
		ac.moveToElement(pl).perform();
		
		as.findElement(By.xpath("//a[text()='Koyambedu")).click();
	

	}

}
