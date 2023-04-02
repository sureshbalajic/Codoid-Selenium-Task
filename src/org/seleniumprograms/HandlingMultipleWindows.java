package org.seleniumprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("WebDriver.EdgeDriver.Driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");

		WebDriver a = new EdgeDriver();
		
		a.get("https://www.amazon.in/");
		
		a.manage().window().maximize();
		
		a.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung A23",Keys.ENTER);

	    a.findElement(By.xpath("//span[text()='Samsung Galaxy A23 Blue, 8GB RAM, 128GB Storage with No Cost EMI/Additional Exchange Offers']")).click();;
	    
	    //to get the present window ID
	    
	    String parent = a.getWindowHandle();
	    System.out.println(parent);
	
	    System.out.println("============");
	    
	   
	    Set<String> Child = a.getWindowHandles();
	    System.out.println(Child);
	
	    Thread.sleep(2000);
	    
	    //to switch over to parent Window
	    
	    a.switchTo().window(parent);
	    
	    
	     
	    
	   
		}
	
	
	

}
