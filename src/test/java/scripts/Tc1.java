package scripts;


import org.testng.annotations.Test;

import com.firelawn.genericlib.BaseClass;

import io.github.bonigarcia.wdm.webdriver.WebDriverCreator;
import pompages.Cart;
import pompages.DemoappHome;
import pompages.SkillHomePage;

public class Tc1  extends BaseClass{
@Test
	public void gs() {
	
		SkillHomePage s=new SkillHomePage(driver); 
	           DemoappHome c = s.mainPage();
	           webdri.switchtabs(driver);
            webdri.mouseHover(driver, c.getCourse());
          Cart b = c.demoPage();
          webdri.doubleclick(driver, b.getPlus());
          b.cartbutton();
          
		
	}
	
	
	
}