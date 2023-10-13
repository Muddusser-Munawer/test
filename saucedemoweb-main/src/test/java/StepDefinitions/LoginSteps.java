package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginSteps 
{
	WebDriver driver= null;    
	@Given("browser is open")
	public void browser_is_open() 
	{
     // System.out.println("Browser is open");
      System.setProperty("webdriver.chromedriver", "C:/Users/hp/Desktop/java practice/Work/Cucumberjava/src/test/resources/Driver/chromedriver.exe");
	  driver = new ChromeDriver(); 
	}
	@And("user is on login page")
	public void user_is_on_login_page() 
	{
		driver.navigate().to("https://www.saucedemo.com/");
	}
	@When("I enter username and password")
	public void i_enter_username_and_password()
	{
	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@And("I click the login button")
	public void i_click_the_login_button() 
	{
		driver.findElement(By.id("login-button")).click();
	}
	@Then("Add to card, checkout and logout")
	public void add_to_card_checkout_and_logout() throws InterruptedException 
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("checkout")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("first-name")).sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("last-name")).sendKeys("User");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("postal-code")).sendKeys("75000");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("continue")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("finish")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("back-to-products")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("logout_sidebar_link")).click();
        driver.close();
        driver.quit();
	}

}
