package AssignmentMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SplitBrowser {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	Dimension d = new Dimension(750, 800);
	driver.manage().window().setSize(d);
	WebDriver driver1 =new EdgeDriver();
	driver.get("https://www.swiggy.com");
	Dimension d1 = new Dimension(300, 500);
	driver.manage().window().setSize(d1);
	Point p = new Point(750, 10);
	driver1.manage().window().setPosition(p);
	Point p1 = new Point(550, 0);
	driver.manage().window().setPosition(p1);
}
}
