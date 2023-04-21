package JavaTesting;

public class MethodsDemo 
{
	public static void main(String args[])
	
	MethodsDemo md=new MethodsDemo();
	md.doLogin();
	md.doLogin();
	md.doLogin();
	md.doLogout();
		
	

public int doLogin()
{
	//login code
	return 10;
}

public String doLogin()
{
	rerturn "abc";
}

public void doLogin()
[
	return "c";
}

public void doLogout()
{
	doLogin();
	System.out.println("Logout Successfully");
}

}