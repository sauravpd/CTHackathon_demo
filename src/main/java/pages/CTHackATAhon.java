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
	
	@FindBy(xpath = "//input[@id ='keyword']")
	private WebElement Searchbox;
	
	@FindBy(xpath = "//li[@class = 'selected']/a")
	private WebElement company;
	
	@FindBy(xpath = "//span[@id = 'symbol']")
	private WebElement symbol;
	
	@FindBy(xpath = "//ul[@class = 'stock']//div[@id = 'dayHigh']")
	private WebElement high;
	
	@FindBy(xpath = "//ul[@class = 'stock']//div[@id = 'dayLow']")
	private WebElement low;
	

	public CTHackATAhon(WebDriver driver) 
	{
		super(driver);
	}

	public int getCount()
	{
		return CTHackATAhonText.size();
	}
}
