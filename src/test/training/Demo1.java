package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;

	@Test
	public void browser() {
		String path = System.getProperty("user.dir");
		String genericPath = path + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPath);

		driver = new ChromeDriver();
	}
	
	
	//AfterMethod all method
	
	//after all test
	@AfterTest
	public void distroy(){
		//driver.close();
	}
	@Test
	public void flipkart() throws Exception {
		driver.get(
				"https://www.flipkart.com/");

		// driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("redmi
		// 7");
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).submit();
		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
		/*
		 * Thread.sleep(5000); for (String winHandle :
		 * driver.getWindowHandles()) { driver.switchTo().window(winHandle); //
		 * switch focus of WebDriver to the next found window handle (that's
		 * your newly opened window) }
		 */
	/*	driver.findElement(
				By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button"))
				.click();

		Thread.sleep(10000);

		driver.findElement(By
				.xpath("//*[@id =\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input"))
				.sendKeys("9695173723");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input"))
				.sendKeys("kartik@2");*/
		
		
		
		WebElement we= driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		Actions action = new Actions(driver);
		Action build = action.click(we).build();
		build.perform();
		
		
		// *[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input
		// *[@id="container"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button

	}

	
}
