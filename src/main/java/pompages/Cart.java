package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	public WebDriver driver;

	@FindBy(id="add")
	private WebElement plus;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cart;
	
	
	public  Cart(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}

	

	public void cartbutton()
	{
		
		cart.click();
	}



	public WebElement getPlus() {
		return plus;
	}
	
	

}
