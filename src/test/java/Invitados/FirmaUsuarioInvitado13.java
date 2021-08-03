package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class FirmaUsuarioInvitado13 {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void PrecertificarInvitado9() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p13-2@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("r7ywUxoHVnEsx@2"); //Actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
        driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\kij0906199r1.cer");
	    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Claveprivada_FIEL_KIJ0906199R1_20190614_163417.key");
	    driver.findElement(By.id("privateKeyPassword")).sendKeys("12345678a");
	    driver.findElement(By.id("iniciar")).click();
	    
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		 }
	@Test(priority=2)
	  public void FirmarDocUsuarioInvitado13() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p13-2@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();

		 driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("12345678a");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.cssSelector(".ui-button-text")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=3)
	  public void ValidarQueSubaDocPerfil13() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p13-2@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("12345678a");
		 Thread.sleep(3000);
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