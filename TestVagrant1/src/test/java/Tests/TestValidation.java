package Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


import Page.*;
public class TestValidation extends BaseClass{
	String ImdbDate;
	String ImdbCountry;
	String wikidate;
	String wikiCountry;

	@Test
	public void imdbTest() throws InterruptedException {
		
		driver.get(imdburl);
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		ImdbPage im=new ImdbPage(driver);
		im.enterMovieName(movie);
		im.search();
		
		WebElement movielink= driver.findElement(By.partialLinkText("Part 1"));
		movielink.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement detailslbl=driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[1]/div/hgroup/h3/span"));
		js.executeScript("arguments[0].scrollIntoView();",detailslbl);
	
	
	 ImdbDate=im.getDate();
	
	 ImdbCountry=im.getCountry();

	}
	
	
	
	@Test
	public void wikiTest() throws InterruptedException {
	driver.navigate().to(wikiurl);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	Wikipedia wpage=new Wikipedia(driver);
	
	wpage.enterMovieName(movie);
	wpage.searchMovie();
 wikidate= wpage.getReleaseDate();
 wikiCountry=wpage.getCountry();
 Assert.assertEquals(ImdbCountry,wikiCountry);
 Assert.assertEquals(ImdbDate,wikidate); //Assert Fails here Date


	
}
	

}