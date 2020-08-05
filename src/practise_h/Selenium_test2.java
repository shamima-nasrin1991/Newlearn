package practise_h;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_test2 {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p1//DRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p1//DRIVER//geckodriver.exe ");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://expedia.com");
		System.out.println("Website open successfully");
		driver.findElement(By.id("header-itineraries")).click();
		driver.findElement(By.id("unified-itin-emailId")).sendKeys("shamimas102@gmail.com");
		driver.findElement(By.id("unified-itin-password")).sendKeys("Television17");
		driver.findElement(By.id("unified-itin-submit-button")).click();
		System.out.println(" Data povide ");
		// TODO Auto-generated method stub

	}

}
