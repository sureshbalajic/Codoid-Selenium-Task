package org.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotTask {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("WebDriver.EdgeDriver.Driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\msedgedriver.exe");

		WebDriver ss = new EdgeDriver();
		
		ss.get("https://www.facebook.com/");
		
		WebElement text = ss.findElement(By.id("email"));
		
		text.sendKeys("balaji@gmail.com");
		
		String attribute = text.getAttribute("value");
		System.out.println(attribute);
		
		TakesScreenshot sc = (TakesScreenshot) ss;
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		
		File desti = new File("C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\DestinationFolder//picture.png");
	     
		FileUtils.copyFile(source, desti);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
