package training;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Strings;

public class Demo2 {
	WebDriver driver;

	@Test
	public void browser() {
		String path = System.getProperty("user.dir");
		String genericPath = path + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPath);

		driver = new ChromeDriver();
	}

	@Test
	public void flipkart() throws Exception {
		driver.get(
				"https://www.flipkart.com/psychology-adaptation-four-colour-indian-subcontinent-5/p/itmehref9ecyrxzb?pid=9789332558540&lid=LSTBOK9789332558540JOANGI&marketplace=FLIPKART&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_0_4_na_na_pr&otracker1=AS_QueryStore_OrganicAutoSuggest_0_4_na_na_pr&fm=SEARCH&iid=en_5MTmNOQgsnTHNXM%2FUi1PTTh7THYbuwG8U1LJSuGupWa2xkniQAMYq6BTd%2F8mIvQSA2MRzu2VULRvGKbwq8rN5g%3D%3D&ppt=sp&ppn=sp&ssid=rcczzzp6y80000001569473809361&qH=7d8949bcbf85067f");

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
		driver.findElement(
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
				.sendKeys("kartik@2");
		driver.findElement(By.xpath("")).sendKeys("kartik@2");
		driver.close();
		// *[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input
		// *[@id="container"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button

	}

	
}
