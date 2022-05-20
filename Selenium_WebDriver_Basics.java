package SeleniumSess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Firefox
		// System.setProperty("webdriver.gecko.driver", "/home/ashish/Downloads/GeckoDriver/geckodriver");
		// WebDriver driver= new FirefoxDriver();
		// driver.get("http://www.google.com");
		
		//Launch Chrome
		
		//Automation:
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/ChromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		//System.out.println(t);
		
		//Validation:
		if (title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect");
		}	
		System.out.println(driver.getTitle()); //get title of page
		System.out.println(driver.getCurrentUrl()); //get curent url
		//System.out.println(driver.getPageSource());
		driver.quit();
		

	}

}
