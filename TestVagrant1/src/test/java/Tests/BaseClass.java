package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
public String imdburl="https://www.imdb.com/";
public String wikiurl="https://wikipedia.org/";
public static String movie="Pushpa: The Rise";
public static WebDriver driver;
public  String expectedReleaseDate="17 December 2021";
public String expectedCountry="India";


@BeforeClass
public void setup()

{
System.setProperty("webdriver.chrome.driver","C://drivers//chromedriver_win32//chromedriver.exe");	
driver=new ChromeDriver();

}
@AfterClass
public void tear()
{
driver.quit();	
}
}

