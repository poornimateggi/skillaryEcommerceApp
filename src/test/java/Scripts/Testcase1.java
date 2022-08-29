package Scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPage.AddtocardPage;
import pomPage.SkillaryDemoPage;
import pomPage.SkillaryPage;

public class Testcase1  extends BaseClass{
	
	@Test
	public void tc1() {
		SkillaryPage s= new SkillaryPage(driver);
		s.gearsbutton();
		s.skillraryDemoapplication();
		
		driverutilies.switchTab(driver);
		SkillaryDemoPage sd=new SkillaryDemoPage(driver);
		driverutilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtraining();
		
		AddtocardPage a=new AddtocardPage();
		driverutilies.doubleclick(driver,a.getAddbtn());
		a.addtocartbutton();
		driverutilies.alertpopup(driver);
		
	}

}
