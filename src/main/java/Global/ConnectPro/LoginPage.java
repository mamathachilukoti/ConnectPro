package Global.ConnectPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	@FindBy(linkText="Register/Login")
	WebElement Reglink;
	
	@FindBy(name="Email")
	WebElement loginname;
	
	@FindBy(name="Password")
	WebElement loginPassword;
	
	@FindBy(className="form-group")
	WebElement btn;
	
	public LoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void getreglink()
	{
		Reglink.click();
	}
	public void getusername(String uname)
	{
		loginname.sendKeys(uname);
	}
	public void getpassword(String pswd)
	{
		loginPassword.sendKeys(pswd);
	}
	public void clickbtn()
	{
		btn.click();
	}
}
