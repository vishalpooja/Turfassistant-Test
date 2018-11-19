package Onboarding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Onboardingtest {
	public 	WebDriver driver;
  
	@Test(priority=1)
  public void Signin() {
	  driver.findElement(By.xpath("/html/body/div[1]/section/div/section/div/div/div[1]/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("14@1.com");
	  driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("1234");
	  driver.findElement(By.xpath("//*[@id=\"exampleInputPassword2\"]")).sendKeys("1234");
	  WebElement radioBtn = driver.findElement(By.xpath("/html/body/div[1]/section/div/section/div/div/div[2]/div[3]/form[3]/div[6]/div/label/input"));
         radioBtn.click();
         driver.findElement(By.xpath("/html/body/div[1]/section/div/section/div/div/div[2]/div[3]/form[3]/div[7]/button")).click();
  }
@Test(priority=2)
public void Chooseplan() throws Exception {
	driver.findElement(By.xpath("/html/body/div[1]/section/div/section[3]/div[1]/div/div/div[1]/div/button")).click();
	System.out.println("Turf Assistant Month To Month$ 297 per month");
	driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys("4242424242424242");
	driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div/input")).sendKeys("vishal");
	driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/div/input")).sendKeys("Singh");
	driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[3]/div/input")).sendKeys("tadev2017");
	Select Expirymonth = new Select(driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[4]/div/div[1]/select")));
	Expirymonth.selectByIndex(1);
	//System.out.println("Expirymonth");
	//WebElement mySelectElement = driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[4]/div/div[2]/select"));
	//Select dropdown= new Select(mySelectElement);
	//dropdown.selectByValue("2020");
	// Thread.sleep(10000);
	Select ExpiryYear=new Select(driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[4]/div/div[2]/select")));
	ExpiryYear.selectByIndex(4);
	driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[1]/div[4]/div/div[3]/input")).sendKeys("123");
	WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/form/div[3]/div/label/span"));
    radioBtn.click();
    driver.findElement(By.xpath("//*[@id=\"billing-section\"]/div/div/div[2]/div/div/div[1]/button")).click();
}

@Test(priority=3)
public void Userprofile() {
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/div/form/div[1]/div[1]/div/input")).sendKeys("Vishal");
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/div/form/div[1]/div[2]/div/input")).sendKeys("Singh");
	WebElement droppath = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/div/form/div[2]/button"));
	droppath.sendKeys("india");
	droppath.click();
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("8961440052");
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/div/form/div[2]/button")).click();
}

@BeforeTest
public void Launchingturf() {
	  System.setProperty("webdriver.chrome.driver","D:\\vishal singh\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("http://qa.turfassistant.com/#!/time-clock/status");
	  
}
  @AfterTest
  public void afterTest() {
	  
  }

}
