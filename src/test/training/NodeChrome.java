package training;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NodeChrome {
	WebDriver driver;
	String nodeUrl;
	@Test
	public void setUp_Chrome() throws MalformedURLException {
		nodeUrl="http://192.168.43.235:4444/grid/register/";
				DesiredCapabilities capabilities= DesiredCapabilities.chrome();
		//capabilities.setBrowserName("chrome");
		//capabilities.setPlatform(Platform.WIN10);
		driver=new RemoteWebDriver(new URL(nodeUrl), capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
	}

}
