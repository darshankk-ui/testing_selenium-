package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjects_opencart_registeration {
		By AccountLink = By.partialLinkText("My Account");
		By RegisterLink = By.linkText("Register");
		By firstname=By.id("input-firstname");
		By lastname =By.name("lastname");
		By email=By.xpath("//input[@name='email']");
		By password = By.cssSelector("input.form-control[name='password']");
		By subscriptionyes=By.id("input-newsletter-yes");
		By submitbutton=By.xpath("//button[@type='submit']");
	    WebDriver driver;
		
		
		public pageobjects_opencart_registeration(WebDriver driver) {
			this.driver=driver;
		}
		public void clickonaccount() {
			driver.findElement(AccountLink).click();
		}
		public void clickonregister() {
			driver.findElement(RegisterLink).click();
		}
		public void enterfirstname() {
			driver.findElement(firstname).sendKeys("gayatri");
		}
		public void enterlastname() {
			driver.findElement(lastname).sendKeys("xyz");
		}
		public void enteremail() {
			driver.findElement(email).sendKeys("gayatri@yahoo.com");
		}
		public void enterpasswordname() {
			driver.findElement(password).sendKeys("welcome");
		}
		public Boolean subscriptions() {
			Boolean flag;
			flag=driver.findElement(subscriptionyes).isSelected();
		    return flag;
		}
		public void clickonsubmit() {
			driver.findElement(submitbutton).click();
		}
		public Boolean submitteddisplayed() {
			Boolean flag1;
			flag1=driver.findElement(submitbutton).isDisplayed();
		    return flag1;
		}
		public String submitgettext() {
			String txt=driver.findElement(submitbutton).getText();	
			return txt;
		}
		}

