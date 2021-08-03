package DocumentosPendientes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class Firmar1Invitado5firmantes {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void PrimerFirmanteFirma ()throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("invitado.p14-1@yopmail.com");//ALEXA DÍAZ GONZALES
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    Thread.sleep(2000);
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
	    driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	}
	/* 
	 @Test(priority=2)
	
	  public void precertificaciónInvitado14() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p14-1@yopmail.com");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("KvFMq09/uztGx,1"); //ACTUALIZAR CLAVE TEMPORAL
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("iniciar")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(3000);
	}
	 */
	    @Test(priority=2)
		  public void firmaInvitadoh14() throws InterruptedException {
	    	
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p14-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);

	    driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("filesystemBtn")).click();
		
	    driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
	    driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.key");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.cer");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@AfterTest
	 public void closeDriver() {
	 driver.close();	
	 }
	}	