package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();

		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutiles.switchTabs(driver);
		driverutiles.mouseHover(driver, sd.getCoursetab());
		sd.selenium();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutiles.doubleClick(driver,ad.getAddbtn());
		ad.addtocartbutton();
		driverutiles.alertpopup(driver);

	}

}
