package feature;

public class Login 
{
	public void login_with_validUN_valid_PWD()
	{
		System.out.println("--Login Pass--");
	}
	
	public void login_with_validUN_Invalid_PWD()
	{
		System.out.println("--Login Failed--");
	}
	
	public void login_with_InvalidUN_valid_PWD()
	{
		System.out.println("--Login Failed--");
	}
	
	public void login_with_InvalidUN_Invalid_PWD()
	{
		System.out.println("--Login Failed--");
	}
}
