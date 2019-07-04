import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionAction
{
WebDriver driver;
String at="About HRIS";
String at1="Celebration";
String at2="QAIT Updates";
String at3="HR Policy";
String at4="Food Menu";
String at5="Did you know?";
String at6="Login Panel";



void initialiseWebDriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	driver = new ChromeDriver();
}

void LaunchUrl()
{
	driver.navigate().to("https://hris.qainfotech.com");
	driver.manage().window().maximize();
}
By username=By.id("txtUserName");
By pass=By.id("txtPassword");
By loginbtn=By.name("Submit");



public void inputUserName(String uid)
{
driver.findElement(username).sendKeys(uid);
}
public void inputPassword(String pass2)
{
	driver.findElement(pass).sendKeys(pass2);
}

public void clickOnLoginButton()
{
driver.findElement(loginbtn).click();
}

public void UserLoggedIn()
{
	String url="https://hris.qainfotech.com:8086/time/timesheet";
	System.out.println(url);
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
	Assert.assertEquals(url, actualurl);
}

public void AboutHris()
{
	String et=	driver.findElement(By.xpath("//i[@class='icon-user']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at);
	
	
}

public void OpenAboutHris()
{
	driver.findElement(By.xpath("//i[@class='icon-user']/following-sibling::span")).click();
}

public void celebrations()
{
	driver.findElement(By.xpath("//i[@class='icon-star']/following-sibling::span")).click();
}

public void AboutCelebration()
{
	String et=driver.findElement(By.xpath("//i[@class='icon-star']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at1);
	
	
}

public void food()
{
	driver.findElement(By.xpath("//i[@class='icon-food']/following-sibling::span")).click();
}

public void Aboutfood()
{
	String et=driver.findElement(By.xpath("//i[@class='icon-food']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at4);
	
	
}
public void Qait()
{
	driver.findElement(By.xpath("//i[@class='icon-calendar']/following-sibling::span")).click();
}

public void AboutQait()
{
	String et=driver.findElement(By.xpath("//i[@class='icon-calendar']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at2);
	
	
}
public void info()
{
	driver.findElement(By.xpath("//i[@class='icon-info-sign']/following-sibling::span")).click();
}

public void Aboutinfo()
{

	String et=driver.findElement(By.xpath("//i[@class='icon-info-sign']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at3);
	
	
	
}

public void question()
{
	driver.findElement(By.xpath("//i[@class='icon-question-sign']/following-sibling::span")).click();
}

public void AboutQuestion()
{
	String et=driver.findElement(By.xpath("//i[@class='icon-question-sign']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at5);
	
	
}

public void login()
{
	driver.findElement(By.xpath("//i[@class='icon-lock']/following-sibling::span")).click();
}

public void Aboutlogin()
{
	String et=driver.findElement(By.xpath("//i[@class='icon-lock']/following-sibling::span")).getText().toString();
	Assert.assertEquals(et,at6);
	
	
}


}