package WebDriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	URL url= new URL("https://www.swiggy.com");
	driver.navigate().to(url);
}
}
