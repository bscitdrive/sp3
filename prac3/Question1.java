/*
Write a selenium script to navigate to https://www.toolsqa.com/selenium-training/ 
website and perform following actions-1) Click on Registration button link,2) Come back to 
Home page (Use 'Back' command),  3) Again goback to Registration page (This time use 
'Forward' command), 4) Again come back to Home page (This time use 'To' command), 5) 
Refresh the Browser (Use 'Refresh' command) 
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		//Open ToolsQA Selenium Training page
		driver.get("https://www.toolsqa.com/selenium-training/");
		Thread.sleep(2000);

		//Click on Registration button link (using CSS Selector)
		driver.findElement(By.cssSelector("a[href='#enroll-form']")).click();
		System.out.println("Clicked on Registration button link");
		Thread.sleep(2000);

		//Come back to Home page (Back command)
		driver.navigate().back();
		System.out.println("Come back to Home page");
		Thread.sleep(2000);

		//Go forward to Registration page (Forward command)
		driver.navigate().forward();
		System.out.println("Go forward to Registration page");
		Thread.sleep(2000);

		//Come back to Home page (To command)
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		System.out.println("Come back to Home page");
		Thread.sleep(2000);

		//Refresh the Browser (Refresh command)
		driver.navigate().refresh();
		System.out.println("Refresh the Browser");
		Thread.sleep(2000);

		//Close the browser
		driver.quit();
	}

}

