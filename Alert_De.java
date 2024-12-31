package selenni_New;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_De {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	WebElement alert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	alert.click();
	
	Alert alert2 = driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.accept();
	
	WebElement alert3 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	alert3.click();
	
	WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirm.click();
	
	Alert alert4 = driver.switchTo().alert();
	System.out.println(alert4.getText());
	alert4.dismiss();
	
	WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	element.click();
	
	WebElement element2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	element2.click();
	
	Alert alert5 = driver.switchTo().alert();
	System.out.println(alert5.getText());
	alert5.sendKeys("Dhanvanthan");
	alert5.accept();
	
	
	
	
	
}
}
