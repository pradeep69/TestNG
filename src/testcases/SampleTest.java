package testcases;
import org.testng.SkipException;
import org.testng.annotations.*;

public class SampleTest {

	@Test
	public void testCaseA1(){
		
	}
	
	@Test
	public void testCaseLoginTest(){
		System.out.println("Login into app");
		
	}
	
	@Test(	dependsOnMethods={"testCaseLoginTest" })
	public void testCaseRegister(){
		System.out.println("Register User");
	
	}
	
	@Test(	dependsOnMethods={"testCaseLoginTest","testCaseRegister" })
	public void testCasePassword(){
		System.out.println("Changed Password");
	
	}
	
	
	
	
}
