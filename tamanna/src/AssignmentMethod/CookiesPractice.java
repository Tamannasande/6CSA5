package AssignmentMethod;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice {
	public static void main(String[] args, Set<Cookie> allCookies) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
	   allCookies = driver.manage().getCookies();
	   for(Cookie singleCooky:allCookies)
		   System.out.println(singleCooky.getName());
	   Cookie cooky=new Cookie("selenium","6");
	   driver.manage().addCookie(cooky);
	   allCookies = driver.manage().getCookies();
	    for(Cookie singleCooky:allCookies)
		   System.out.println(singleCooky.getName());
	}
	}


