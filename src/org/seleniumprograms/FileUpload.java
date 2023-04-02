package org.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.EdgeDriver.driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\msedgedriver.exe");
	
        WebDriver fil = new EdgeDriver();
        
        fil.get("https://www.monsterindia.com/seeker/registration");
	    
        fil.manage().window().maximize();
        
//        JavascriptExecutor je = (JavascriptExecutor)fil;
//        je.executeScript("window.scroolBy(0,380)");
        Thread.sleep(5000);
        
        WebElement getfile = fil.findElement(By.xpath("//div[@class='contentTitle']"));
        getfile.click();
        getfile.sendKeys("C:\\Users\\MITHRA C\\Downloads\\resume");
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
