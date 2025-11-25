/*
Automate the following test scenarios: 
a) Invoke firefox Browser 
b) Open URL: https://www.google.co.in/ 
c) Get Page Title name and Title length 
d) Print Page Title and Title length on the Eclipse Console 
e) Get page URL and verify whether it is the desired page or not 
f) Get page Source and Page Source length 
g) Print page Length on Eclipse Console. 
h)  Close the Browser 
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question_2 {

	public static void main(String[] args) throws InterruptedException {
	    // a) Invoke Firefox Browser
	    System.setProperty("webdriver.gecko.driver","E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    // b) Open URL: https://www.google.co.in/
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(2000);

	    // c) Get Page Title name and Title length
	    String title = driver.getTitle();
	    int titleLength = title.length();

	    // d) Print Page Title and Title length on the Eclipse Console
	    System.out.println("Page Title: " + title);
	    System.out.println("Title Length: " + titleLength);

	    // e) Get page URL and verify whether it is the desired page or not
	    String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://www.google.co.in/";
	    if (actualUrl.contains("google.co"))
	        System.out.println("URL Verification Passed: " + actualUrl);
	    else
	        System.out.println("URL Verification Failed! Actual: " + actualUrl);

	    // f) Get page Source and Page Source length
	    String pageSource = driver.getPageSource();
	    int pageSourceLength = pageSource.length();

	    // g) Print page Length on Eclipse Console
	    System.out.println("Page Source Length: " + pageSourceLength);

	    // h) Close the Browser
	    driver.quit();
	}


}

