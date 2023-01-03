package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SkillHomePage {
	public WebDriver driver;

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gears;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	public SkillHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	    this.driver=driver;
}
	
	

	public DemoappHome mainPage()
	{
		gears.click();
		demoapp.click();
		return new DemoappHome(driver);
	}
}
