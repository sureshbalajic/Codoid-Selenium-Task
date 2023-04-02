package org.seleniumprograms;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ShiftBetweenTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MITHRA C\\eclipse-workspace\\Codoid\\Driver\\chromedriver.exe");
		
		ChromeOptions shi = new ChromeOptions();
		
		shi.addArguments("--remote-allow-origins=*");
		
		WebDriver tab = new ChromeDriver(shi);
		
		tab.get("https://www.Facebook.com");
		
		((JavascriptExecutor)tab).executeScript("window.open('https://www.youtube.com/')");		
		
		ArrayList<String> ttbs = new ArrayList<String>(tab.getWindowHandles());
		
		tab.switchTo().window(ttbs.get(1));
		System.out.println(tab.getTitle());
		
		
		tab.switchTo().window(ttbs.get(0));
		System.out.println(tab.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
