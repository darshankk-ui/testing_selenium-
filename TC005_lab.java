package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Title of the page is:"+driver.getTitle());
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("Fathima");
		driver.findElement(By.name("lastname")).sendKeys("bevi");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input.form-control[name='password']")).sendKeys("welcome");
		WebElement subscribe=driver.findElement(By.id("input-newsletter-yes"));
		System.out.println("name attribute value of yes button is:"+subscribe.getAttribute("name"));
		
		if(subscribe.isSelected())
		{
			System.out.println("Yes is selected");
		}
		else {
			System.out.println("Yes is not selected");
		}
		if(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed())
		{
			System.out.println("Submit button is disabled");
			//WebElement continue = driver.findElement(By.xpath("//button[@type='submit']"));
			
		}
		driver.findElement(By.cssSelector(null));
	}

}
