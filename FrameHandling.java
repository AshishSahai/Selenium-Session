package SeleniumSess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/ChromeDriver/chromedriver");
		WebDriver driver= new ChromeDriver();  // Launch Window
		driver.manage().window().maximize();   // Maximize window
		driver.manage().deleteAllCookies();    // Delete all cookies
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div/input")).sendKeys("ashish07kumars@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/div/input")).sendKeys("Arnab@32@");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
    	Thread.sleep(4000);
    	driver.switchTo().frame("MainPanel");  // To switch to frame // Nowadays frames are not used in sites
    	//driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click(); // might not work due to changes in site
    	

	}

}
