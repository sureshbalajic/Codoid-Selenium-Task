package org.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.EdgeDriver.Driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\msedgedriver.exe");
		
		WebDriver hf = new EdgeDriver();
		
		hf.get("https://character.tech/practice/frames-examples-selenium.webdriver");
		
		List<WebElement> fe = hf.findElements(By.tagName("iframe"));
		
		int size = fe.size();
		
		System.out.println(size);
		
		//switching the control by frame index
		
		hf.switchTo().frame(0);
		
		WebElement txtbox = hf.findElement(By.tagName("input"));
		
		txtbox.sendKeys("suresh");
		
		//switching the control by frame id
		
		hf.switchTo().frame("frame3");
		
		WebElement chk = hf.findElement(By.id("a"));
		chk.click();
		
		//switching the control to webpage
		
		hf.switchTo().defaultContent();
		
		hf.findElement(By.xpath("iframe[@id='frame2']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
