package SeleniumAllTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seleniumTestNew {
	
	ChromeDriver driver;
	
	@BeforeMethod()
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void VerifyTitle()
	{
		String x = driver.getTitle();
		System.out.println("Title is:: " +x);
		Assert.assertEquals(x, "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka");
		
	}
	
	@Test
	public void VerifyUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println("URL is:: " +url);
		
		Assert.assertEquals(url,"https://www.edureka.co/");
	}
	
	@AfterMethod()
	public void close()
	{
		driver.close();
	}
}
