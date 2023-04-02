package org.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Edgedriver.driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\msedgedriver.exe");
		
		WebDriver Aler = new EdgeDriver();
		
		Aler.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement button = Aler.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		button.click();
		
		
		org.openqa.selenium.Alert alert = Aler.switchTo().alert();
		
		String txt = alert.getText();
		System.out.println(txt);
		
		alert.accept();
		
		Thread.sleep(5000);
		
		Aler.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		Aler.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	    
		alert.dismiss();
		
		Thread.sleep(5000);
		
		Aler.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    
		Aler.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	     
		alert.sendKeys("Hi Iam Suresh Balaji,Warning You To Be Alert");
		
		System.out.println(alert.getText());
		
		alert.accept();
		
	
	
	}

}
