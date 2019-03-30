package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * CTHackATAhon
 * @author saurav
 *
 */
public class CTHackATAhon extends PageObject
{

	@FindBy(xpath = "//*[contains(text(),'#CTHackATAhon')]")
	private List<WebElement> CTHackATAhonText;

	public CTHackATAhon(WebDriver driver) 
	{
		super(driver);
	}

	public void enterUsername(String username) 
	{
		userName.sendKeys(username);
	}

	
	public void enterPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	public int getCount()
	{
		return CTHackATAhonText.size();
	}
}
