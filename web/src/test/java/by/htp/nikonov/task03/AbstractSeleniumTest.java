package by.htp.nikonov.task03;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractSeleniumTest {
	protected WebDriver driver;
	protected static final String URL="http://localhost:6013/NewsManagment/";
	protected static final String webDriverLocation="src\\test\\resources\\chromedriver.exe";
	
	public AbstractSeleniumTest() {
		System.setProperty("webdriver.chrome.driver", webDriverLocation);
	}
	
	@Before
	public void init() {
		driver=new ChromeDriver();
	}
	
	
	@After
	public void destroy() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
