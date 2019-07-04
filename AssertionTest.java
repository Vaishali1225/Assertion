import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionTest 
{
	AssertionAction login;
	 @BeforeClass
	  public void beforeClass()
	 {
			login=new AssertionAction();
			login.initialiseWebDriver();
			login.LaunchUrl();
			
	  }
	 
	 @Test
	  public void f() throws InterruptedException {
		 	login.login();
		 	Thread.sleep(1000);
		 	login.Aboutlogin();
		 	Thread.sleep(1000);
			login.AboutHris();
			Thread.sleep(1000);
			login.OpenAboutHris();
			Thread.sleep(1000);
			login.AboutHris();
			Thread.sleep(1000);
			login.celebrations();
			Thread.sleep(1000);
			login.AboutCelebration();
			Thread.sleep(1000);
			login.Qait();
			Thread.sleep(1000);
			login.AboutQait();
			Thread.sleep(1000);
			login.info();
			Thread.sleep(1000);
			login.Aboutinfo();
			Thread.sleep(1000);
			login.food();
			Thread.sleep(1000);
			login.Aboutfood();
			Thread.sleep(1000);
			login.question();
			Thread.sleep(1000);
			login.AboutQuestion();
			
	  }
}
