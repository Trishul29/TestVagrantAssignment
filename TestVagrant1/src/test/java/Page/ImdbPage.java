package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage {
	
	WebDriver imdbDriver;
	public ImdbPage(WebDriver idriver)
	{
		
		imdbDriver=idriver;
		PageFactory.initElements(idriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"suggestion-search\"]")
	WebElement SearchImdbText;
	
    @FindBy(xpath="//*[@id=\"iconContext-magnify\"]")	
   WebElement Searchbtn;
    
    @FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/div/ul/li/a")
public WebElement ReleaseDate ;
    
    @FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a")
    
    public WebElement ImdbCountry;
    
    
  
public void enterMovieName(String moviename)
{
SearchImdbText.sendKeys(moviename);	

}

public void search() {
	
	
	Searchbtn.click();
}

public String getDate()
{

	String date=ReleaseDate.getText();
return date;

}

public String getCountry()
{
	String country=ImdbCountry.getText();
	

return country;

}

}
