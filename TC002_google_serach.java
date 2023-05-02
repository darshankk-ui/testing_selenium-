package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_google_serach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println("Title of the page is:"+driver.getTitle());
		WebElement searchelement = driver.findElement(By.id("APjFqb"));
		
		searchelement.sendKeys("Test Methods");
		
		driver.findElement(By.name("btnK")).click();
		
		System.out.println("Title of page"+driver.getTitle());	
		driver.navigate().back();
		System.out.println("Title of page"+driver.getTitle());	
		driver.navigate().forward();
		System.out.println("Title of page"+driver.getTitle());
		System.out.println("Page source:"+driver.getPageSource());
		driver.quit();

	}

}
