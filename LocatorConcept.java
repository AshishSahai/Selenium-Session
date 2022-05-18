package SeleniumSess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Blob");  //By.xpath
		
		driver.findElement(By.name("lastname")).sendKeys("Dickwad");  //By.name
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("DickwadOfDickTown@gmail.com");
		
		//driver.findElement(By.id("password")).sendKeys("Josh@1234");  //By.id
		
		//driver.findElement(By.linkText("www.ebay.com")).click();  //By linktext
		
		//driver.findElement(By.partialLinkText("User Privacy")).click(); // By partial link - not useful
		
		driver.findElement(By.cssSelector("#password")).sendKeys("Josh@1234"); //By CSS Selector
		
		//driver.findElement(By.className(className)).sendKeys(data); //By classname	not useful
		
		}

}
