package opencart;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;


public class TC001_opencart_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Title of the page is:"+driver.getTitle());
		
		driver.close();
	}

}
