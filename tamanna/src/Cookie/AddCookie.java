package Cookie;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Cookie cooky=new Cookie("Simple cookie","123456");
		System.out.println(cooky);
		driver.manage().addCookie(cooky);
	}

}
