package dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//TO MAXIMIZE A WINDOW
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		//System.out.println(s);
		List<WebElement> options=driver.findElements(By.tagName("a"));
		int count=options.size();
		int linknumber=0;
		System.out.println("Total Number of links present in Web page is: " + count);
		
		for(WebElement options1:options)
		{
			linknumber=linknumber+1;
			System.out.print(linknumber +" link is: ");
			System.out.println(options1.getAttribute("href"));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
