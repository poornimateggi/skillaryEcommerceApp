package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPage.CorejavaPage;
import pomPage.SkillaryPage;
import pomPage.WishListPage;

public class TestCase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException{
	SkillaryPage s=new SkillaryPage(driver);
	s.searchtextbox(pdata.getData("searchtextbox"));
	s.searchbutton();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.seleniumcourse();
	
	WishListPage w=new WishListPage(driver);
	driverutilies.switchtoframe(driver);
    w.playbutton();
    Thread.sleep(10000);
    w.pausebutton();
    driverutilies.switchbackframe(driver);
    w.wishlistbtn();
}}

	
	
	


