package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoappHome {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement course;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
     private WebElement seleniumtraining;




	public DemoappHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public Cart demoPage()
	{
		
		seleniumtraining.click();
		return new Cart(driver);
	}


	public WebElement getCourse() {
		return course;
	}

}
