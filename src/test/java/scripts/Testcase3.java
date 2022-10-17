package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage sl=new SkillraryLoginPage(driver);
	sl.serachtextbox(pdata.getData("serach"));
	sl.serachbutton();
	
	CoreJavaPage c=new CoreJavaPage(driver);
	c.corejavacourse();
	
	WishlistPage w=new WishlistPage(driver);
	w.closepopup();
	driverutiles.switchFrame(driver);
	
	Thread.sleep(2000);
	w.playbutton();
	Thread.sleep(5000);
	w.pausebtn();
	driverutiles.switchBack(driver);
	w.addtowishlidtbtn();
	
	
	}

}
