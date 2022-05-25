package SeleniumSess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpotifySignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();   // Launch Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spotify.com/us/signup");  // Sign Up Page
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Automation
		driver.findElement(By.id("email")).sendKeys("ashish07kumarsss@gmail.com");
		driver.findElement(By.id("confirm")).sendKeys("ashish07kumarsss@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Jopy&123456");
		driver.findElement(By.id("displayname")).sendKeys("Choo");
		
		// Handle Drop Down
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("June");
		driver.findElement(By.id("day")).sendKeys("12");
		driver.findElement(By.id("year")).sendKeys("1997");
		
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/form/fieldset/div/div[1]/label/span[2]")).click();
		driver.findElement(By.cssSelector("#__next > main > div > div > form > div:nth-child(8) > div > label > span.Indicator-sc-1airx73-0.ihUlHW")).click();
		
		}

}
