package com.quantinsti_Log_in_Verify;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Quantinsti_Log_in_Assignment_no_1 
{
	WebDriver driver;
	
	@Test
	public void Setup_Browser() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("https://quantra.quantinsti.com/");
	}
	
	@Test
	public void Setup_locator() throws Exception 
	{
	//Click on the login button
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click(); // Login Link
		
	//Log in as username & password
		driver.findElement(By.name("email")).sendKeys("krunaltelang07@gmail.com"); 
		driver.findElement(By.name("password")).sendKeys("asdf@123");				
		
	//enter login Button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click(); 

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
	//click on Browse course
		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/div[1]/li[5]/span[1]/a[1]")).click(); 
		
	//click onSentiment Analysis in Trading
		driver.findElement(By.xpath("//span[contains(text(),'Sentiment Analysis in Trading')]")).click(); 
		
	//click on enroll now
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//span[contains(text(),'Enroll Now+@10% OFF')]")).click();

	//Capture the Base Amount
		String BaseAmmount = driver.findElement(By.xpath("//div[contains(text(),'Base Amount')]")).getText();
		System.out.print(BaseAmmount);

	//Capture the Base Amount Price
		String price = driver.findElement(By.xpath("//div[contains(text(),'₹35192')]")).getText();
		System.out.println(" = "+price);
		
	//Capture the Amount Payable
		String AmmountPaybale =driver.findElement(By.xpath("//h5[contains(text(),'Amount Payable')]")).getText();
		System.out.print(AmmountPaybale);
		  
		String FinalPrice =driver.findElement(By.xpath("//span[contains(text(),'₹41527')]]")).getText();
		System.out.print(" = "+FinalPrice);
		
	//clicking on the View Details link
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
		 
	//Multi Window handling
		String Parent_window= driver.getWindowHandle();
		 
		 for(String Child_window: driver.getWindowHandles()) 
		 {
			 driver.switchTo().window(Child_window);	 
		 }
		 driver.close();
		 driver.switchTo().window(Parent_window);
		 
	//remove any one course from the cart page
		 driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[2]")).click();
		
		 String massege=driver.findElement(By.xpath("///div[@id='3cVOwSTHj']")).getText();
		 System.out.println(massege);
		 
	//click on the Apply coupon button 
		driver.findElement(By.xpath("//span[contains(text(),'Apply Coupon')]")).click();
		
	//type ABC into the text box 
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("ABC");
		
	//inside the popup click on the Apply coupon button 
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]/span[1]")).click();
		 
		Thread.sleep(5000);
	//CLOSE POPUP
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
			
	//Sign out from the application
		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/div[1]/li[6]/div[1]")).click();
		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/div[1]/li[6]/div[2]/ul[1]/li[5]/a[1]")).click();
	}
}















