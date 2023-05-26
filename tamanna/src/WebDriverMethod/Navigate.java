package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	driver.get("https://www.fb.com");
	driver.navigate().to("https://demo.actitime.com/login.do");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
