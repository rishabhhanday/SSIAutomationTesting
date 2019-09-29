package training;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationFlipkart {
	WebDriver driver;

	@BeforeTest
	@Parameters({"browser"})
	public void browser(String browser)throws Exception {
		if(browser.equals("chrome")){
			String path = System.getProperty("user.dir");
			String genericPath = path + "\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", genericPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			FileInputStream fis = new FileInputStream(new File("F:\\AutomationPractice\\config.properties"));
			
			Properties prop = new Properties();
			prop.load(fis);
			String result = prop.getProperty("Environment");
			driver.get(result);
		}
		
	}

	@Test(priority = 1)
	public void placeOrder() throws Exception{

		
		

		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
					.sendKeys("redmi 7");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"))
					.submit();
			//Thread.sleep(10000);
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"))
					.click();
			//Thread.sleep(2000);

			tab = new ArrayList<String>(driver.getWindowHandles());
			//Thread.sleep(2000);
			driver.switchTo().window(tab.get(1));
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/a")).click();
			// Login
			//Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input"))
					.sendKeys("9695173723");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input"))
					.sendKeys("kartik@2");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button"))
					.click();
			//Thread.sleep(4000);
			driver.findElement(
					By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]")).click();
			//Thread.sleep(2000);
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[2]/div[1]/input"))
					.sendKeys("Kartikey Gupta");
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[2]/div[2]/input"))
					.sendKeys("9695173723");
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[3]/div[1]/input"))
					.sendKeys("452010");
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[3]/div[2]/input"))
					.sendKeys("BHAWARKUA");
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[4]/div/div[1]/textarea"))
					.sendKeys("WorldPay.Inc, IT Park ");
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[5]/div[1]/div[1]/input"))
					.sendKeys("");
			WebElement element = driver.findElement(By.xpath(
					"//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[5]/div[2]/div/div[2]/select"));
			Select state = new Select(element);
			state.selectByVisibleText("Madhya Pradesh");
			Actions action = new Actions(driver);
			WebElement we1 = driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[6]/div[1]/input"));
			
			Action build = action.moveToElement(we1).keyDown(Keys.SHIFT).sendKeys("IT PARK").keyUp(Keys.SHIFT).build();
			
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[6]/div[2]/input"))
					.sendKeys("7985605973");
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[7]/div/div/label[2]/div[2]/span"))
					.click();
			driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[8]/button[1]"))
					.click();
			//Thread.sleep(2000);
			WebElement we = driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button"));
			
			Action build1 = action.click(we).build();
			build1.perform();
			build.perform();
			
			
			
			
			driver.findElement(
					By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[5]"))
					.click();
			
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii");
		driver.close();

	}
}
