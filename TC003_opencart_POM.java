package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_opencart_POM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Title of the page is:"+driver.getTitle());
		pageobjects_opencart_registeration obj= new pageobjects_opencart_registeration(driver); 
		
		
		//driver.findElement(By.partialLinkText("Account")).click();
		obj.clickonaccount();
		//driver.findElement(By.linkText("Register")).click();
		obj.clickonregister();
		
		//driver.findElement(By.id("input-firstname")).sendKeys("Fathima");
		obj.enterfirstname();
		//driver.findElement(By.name("lastname")).sendKeys("bevi");
		obj.enterlastname();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		obj.enteremail();
		//driver.findElement(By.cssSelector("input.form-control[name='password']")).sendKeys("welcome");
		obj.enterpasswordname();
		//WebElement subscribe=driver.findElement(By.id("input-newsletter-yes"));
		obj.subscriptions();
		//System.out.println("name attribute value of yes button is:"+subscribe.getAttribute("name"));
		
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
			WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));;
			System.out.println("The text of continue button is:"+continu.getText());
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		else {
			System.out.println("Submit button is not display");
		}
	}

}
