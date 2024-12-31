package demo_Test;

import java.io.IOException;

import demo_Class.Base_Demo;
import demo_Class.FileReaderManager;
import demo_Class.PageObjectManager;

public class Runner_Class extends Base_Demo {
	

	public static void main(String[] args) throws IOException {
		
		driver = browserlaunch();
		PageObjectManager pom = new PageObjectManager(driver);	
		
		String url = FileReaderManager.getfrmm().getcr().geturl();
		urllaunch(url);
		
		String username = FileReaderManager.getfrmm().getcr().getusername();
		passInput(pom.getPl().getUsername(), username);
		
		String password = FileReaderManager.getfrmm().getcr().getpassword();
		passInput(pom.getPl().getPassword(), password);
		
		clickonelement(pom.getPl().getLogin());
		
	}
}
