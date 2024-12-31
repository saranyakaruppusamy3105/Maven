package test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import class1.Base_Demo;

public class Test_Demo extends Base_Demo {
	
	public static void main(String[] args) throws IOException {
		
		brwlaunch();
		urllaunch("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		passinput(username, "abc@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		passinput(password, "Sara@3105");
		//WebElement login = driver.findElement(By.name("login"));
		//clickonelement(login);
		
		screenshot("C:\\Users\\saran\\eclipse-workspace\\Selenium\\Screeshort\\ddr.png");
		
		WebElement createnewacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickonelement(createnewacc);
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		dropdown(day, 1);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		//dropdown(month, )
	}

}
