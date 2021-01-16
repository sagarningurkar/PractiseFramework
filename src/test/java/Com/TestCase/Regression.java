package Com.TestCase;

import org.testng.annotations.Test;

import Com.KeywordFramework.AllKeyword;

public class Regression {
	
	@Test
	public static void TC_1()
	{
		AllKeyword.openBrowser("chrome");
		//AllKeyword.openUrl("https:/www.facebook.com/");
		AllKeyword.openUrl("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession");
		AllKeyword.enterText("xpath", "//input[@type='email']", "Sgar");
	}

}
