package Global.ConnectPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalmembersPage extends Base {
	WebDriver driver;
	@FindBy(partialLinkText="Global Members")
	WebElement globmem;
	
	@FindBy(className="select2-search__field")
	WebElement profile;
	
	@FindBy(id="select2-WhoAmIs-result-2r3j-HR")
	WebElement select;
	
	@FindBy(className="btn btn-primary btn-block")
	WebElement search;
	
	public GlobalmembersPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
		
	}
	
	public void getglobal()
	{
		globmem.click();
	}
	public void getprof()
	{
		profile.click();
	
	}
	public void getselection()
	{
		select.click();
	}
	public void clickser()
	{
		search.click();
	}
	
}
