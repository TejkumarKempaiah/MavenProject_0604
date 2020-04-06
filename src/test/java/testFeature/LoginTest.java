package testFeature;

import org.testng.annotations.Test;

import feature.Login;

public class LoginTest 
{
	Login l1 = new Login();
	
	@Test(priority=1)
	public void tc01()
	{
		l1.login_with_validUN_valid_PWD();
	}
	
	@Test(priority=2)
	public void tc02()
	{
		l1.login_with_validUN_Invalid_PWD();
	}
	
	@Test(priority=3)
	public void tc03()
	{
		l1.login_with_InvalidUN_valid_PWD();
	}
	
	@Test(priority=4)
	public void tc04()
	{
		l1.login_with_InvalidUN_Invalid_PWD();
	}
	
}
