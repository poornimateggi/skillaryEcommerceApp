package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPage.SkillaryDemoPage;
import pomPage.SkillaryPage;
import pomPage.TestingPage;
public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException{
	SkillaryPage s=new SkillaryPage(driver);
	s.gearsbutton();
	s.skillraryDemoapplication();
	
	driverutilies.switchTab(driver);
	SkillaryDemoPage d=new SkillaryDemoPage(driver);
	driverutilies.dropdown(d.getCoursedd(),pdata.getData("coursename"));
	
	TestingPage t=new TestingPage(driver);
    driverutilies.draganddrop(driver,t.getSeleniumtraining(),t.getCart());
	Point loc=t.getFacebook().getLocation();
	int x=loc.getX();
	int y=loc.getY();
	driverutilies.scrollBar(driver, x, y);
	t.facebookicon();
}}
	
	

