package Global.ConnectPro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GlobalmemberTest extends Base {
	WebDriver driver;
	@BeforeTest
	public void init() throws IOException
	{
		driver=initDriver();
	}
	
	@Test
	public void  verifyGlobal()
	{
		driver.get(prop.getProperty("url"));
		LoginPage lp= new LoginPage(driver);
		lp.getreglink();
		lp.getusername("mamathanit1@gmail.com");
		lp.getpassword("Mamatha@123");
		lp.clickbtn();
		String title=driver.getTitle();
		if(title.equals("Login - ConnectPro Community"))
		{
			System.out.println("Successfully logged in");
		}
		else
		{
			System.out.println("Login again");
		}
		GlobalmembersPage gp= new GlobalmembersPage(driver);
		gp.getglobal();
		gp.getprof();
		gp.getselection();
		gp.clickser();
		
	}
	@AfterTest
	public void Close()
	{
		driver.close();
	}
	

}
