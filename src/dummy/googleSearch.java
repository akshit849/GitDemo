package dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class googleSearch {

	
	@Test
	public void gsearch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//TO MAXIMIZE A WINDOW
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String ss="testing";
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(ss);
		Thread.sleep(4000);
		List<WebElement> options=driver.findElements(By.cssSelector("div.wM6W7d"));
		
		int c=options.size();
		//Count Print 
		System.out.println("Total Number of Options Present in the Search list " + c);
		
		//To Print Whole Options List
		
		for(WebElement option1:options) 
		{
			System.out.println(option1.getText());
			if (option1.getText().equalsIgnoreCase("testing tools"))
					{
						option1.click();
						break;
					}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
