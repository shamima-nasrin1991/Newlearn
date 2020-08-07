package practise_h;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p1//DRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p1//DRIVER//geckodriver.exe ");
		WebDriver driver= new FirefoxDriver();
		//using implicit wait for page loading
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		System.out.println("Webpage open successfully");
		driver.findElement(By.id("")).click();
		//here need something
		// TODO Auto-generated method stub

	}

}
