package training;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
WebDriver driver;

	public WebDriver getDriver(){
		return driver;
	}
	
	
	public WebElement findElement(String xPath){
		return driver.findElement(By.xpath(xPath));
		
	}
	
	public void closeDriver(){
		driver.close();
	}
	
	public void type(WebElement we,String keys){
		we.sendKeys(keys);
	}
	public void click(WebElement we){
		we.click();
		
	}
	public void submit(WebElement we){
		we.submit();
		
	}
	
	public String getPassword()throws Exception{
		FileInputStream fis = new FileInputStream(new File("F:\\SSI Java\\AutomationProject\\Products.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Credentials");
		XSSFRow row = sheet.getRow(0);
		return row.getCell(1).getStringCellValue();
	}
	
	public void driverConnection()throws Exception{
		
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
		System.out.println(result);
	}
	
	
	
	
}
