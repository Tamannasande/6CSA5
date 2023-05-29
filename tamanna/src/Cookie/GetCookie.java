package Cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookie {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	Set<Cookie> allCookie = driver.manage().getCookies();
	System.out.println(allCookie.size());
	for(Cookie singleCooky:allCookie)
		
		
		System.out.println(singleCooky.getName());
}
}
