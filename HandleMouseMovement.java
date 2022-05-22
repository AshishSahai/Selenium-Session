package SeleniumSess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();  // Launch Browser
		driver.manage().window().maximize();   //Maximize Window
		driver.manage().deleteAllCookies();    //DeleteAllCookies
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		Actions action = new Actions(driver);   //Mouse 
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Benefits")).click();

	}

}
