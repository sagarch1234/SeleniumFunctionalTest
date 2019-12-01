package SeleniumAllTest;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		
		String x = driver.getTitle();
		System.out.println("Title is:: " +x);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL is:: " +url);
		//driver.get("https://www.amazon.com");
		//driver.manage().window().maximize();
		
		//String url = driver.getCurrentUrl();
		//System.out.println("URL is:: " +url);
		

	}

}
