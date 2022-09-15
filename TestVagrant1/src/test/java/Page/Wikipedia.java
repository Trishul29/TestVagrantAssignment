package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {
	
	WebDriver WikiDriver;
	
		@FindBy(xpath="//*[@id=\"searchInput\"]")
		WebElement SearchInput;
		
		@FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button/i")
		WebElement SearchBtn;
		
		@FindBy(xpath="//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")
		WebElement ReleaseDate;
		
		@FindBy(xpath="//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")
		WebElement MovieCountry;
		
		public Wikipedia(WebDriver wDriver)
		{
			
			WikiDriver=wDriver;
			PageFactory.initElements(wDriver,this);
		}
			
		
		
		
	public void enterMovieName(String name)
	{
		SearchInput.sendKeys(name);
		
		}
	
	
	public void searchMovie()
	{
		
		SearchBtn.click();
		
	}
	
	public String getReleaseDate()
	{
		
		String date=ReleaseDate.getText();
		return date;
	}
	
	public String getCountry()
	{
		
		String Country=MovieCountry.getText();
		return Country;
	}
	
	
	}

